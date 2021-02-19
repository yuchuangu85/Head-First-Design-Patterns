package headfirst.designpatterns.factory.challenge;

public class ZoneFactory {
    public Zone createZone(String zoneId) {
        Zone zone = null;
        if ("US/Pacific".equals(zoneId)) {
            zone = new ZonePacific();
        } else if ("US/Mountain".equals(zoneId)) {
            zone = new ZoneMountain();
        } else if ("US/Central".equals(zoneId)) {
            zone = new ZoneCentral();
        } else if ("US/Eastern".equals(zoneId)) {
            zone = new ZoneEastern();
        }
        return zone;
    }
}