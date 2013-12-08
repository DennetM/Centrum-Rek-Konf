package tools;

import java.util.Comparator;

import POJO.Equipment;

/*
 * Komperator equipmentu po id
 */
public class EquipCompId implements Comparator<Equipment> {

	@Override
	public int compare(Equipment o1, Equipment o2) {
		if (o1.getEquipmentId() < o2.getEquipmentId()) {
			return -1;
		} else if (o1.getEquipmentId() > o2.getEquipmentId()) {
			return 1;
		}
		return 0;
	}
}
