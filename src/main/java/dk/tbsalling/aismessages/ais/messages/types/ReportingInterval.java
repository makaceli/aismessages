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

public enum ReportingInterval {
	Autonomous (0),
	TenMinutes(1),
	SixMinutes(2),
	ThreeMinutes(3),
	OneMinute(4),
	ThirtySeconds(5),
	FifteenSeconds(6),
	TenSeconds(7),
	FiveSeconds(8),
	NextShortReportingInterval(9),
	NextLongerReportingInterval(10),
	FutureUse1(11),
	FutureUse2(12),
	FutureUse3(13),
	FutureUse4(14),
	FutureUse5(15);

	ReportingInterval(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}

	public String getValue() {
	    return toString();
	}

	private final int code;

	public static ReportingInterval fromInteger(Integer integer) {
		if (integer != null) {
			for (ReportingInterval b : ReportingInterval.values()) {
				if (integer.intValue() == b.code) {
					return b;
				}
			}
		}
		return null;
	}
}
