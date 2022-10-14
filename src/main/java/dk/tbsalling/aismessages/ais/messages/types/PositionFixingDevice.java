/*
 * AISMessages
 * - a java-based library for decoding of AIS messages from digital VHF radio traffic related
 * to maritime navigation and safety in compliance with ITU 1371.
 *
 * (C) Copyright 2011- by S-Consult ApS, VAT no. DK31327490, Denmark.
 *
 * Released under the Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * For details of this license see the nearby LICENCE-full file, visit http://creativecommons.org/licenses/by-nc-sa/3.0/
 * or send a letter to Creative Commons, 171 Second Street, Suite 300, San Francisco, California, 94105, USA.
 *
 * NOT FOR COMMERCIAL USE!
 * Contact Thomas Borg Salling <tbsalling@tbsalling.dk> to obtain a commercially licensed version of this software.
 *
 */

package dk.tbsalling.aismessages.ais.messages.types;

public enum PositionFixingDevice {
	Undefined (0),
	Gps(1),
	Glonass(2),
	CombinedGpsGlonass(3),
	LoranC(4),
	Chayka(5),
	IntegratedNavigationSystem(6),
	Surveyed(7),
	Galileo(8);

	PositionFixingDevice(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}

	public String getValue() {
	    return toString();
	}

	private final int code;

	public static PositionFixingDevice fromInteger(Integer integer) {
		if (integer != null) {
			for (PositionFixingDevice b : PositionFixingDevice.values()) {
				if (integer.intValue() == b.code) {
					return b;
				}
			}
		}
		return null;
	}
}
