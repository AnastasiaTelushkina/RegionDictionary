package springboot.dictionary.region.exception;


public class RegionNotFoundException extends RuntimeException {
    public RegionNotFoundException(Long id) {
        super("Could not find region " + id);
    }
}
