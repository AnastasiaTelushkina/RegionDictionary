package springboot.dictionary.region.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.dictionary.region.exception.RegionNotFoundException;
import springboot.dictionary.region.model.Region;
import springboot.dictionary.region.repository.RegionRepository;
import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {
    @Autowired
    private RegionRepository regionRepository;


    @GetMapping
    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Region getRegionById(@PathVariable Long id) {
        return regionRepository.findById(id).orElseThrow(() -> new RegionNotFoundException(id));
    }

    @PostMapping()
    public Region addRegion(@RequestBody Region region) {
        return regionRepository.save(region);
    }

    @PutMapping("/{id}")
    public Region updateRegion(@PathVariable Long id, @RequestBody Region newRegion) {
        return regionRepository.findById(id)
                .map(region -> {
                    region.setName(newRegion.getName());
                    region.setAbbreviation(newRegion.getAbbreviation());
                    return regionRepository.save(region);
                })
                .orElseGet(() -> {
                    newRegion.setId(id);
                    return regionRepository.save(newRegion);
                });
    }

    @DeleteMapping("/{id}")
    public void deleteRegion(@PathVariable Long id) {
        regionRepository.deleteById(id);
    }
}
