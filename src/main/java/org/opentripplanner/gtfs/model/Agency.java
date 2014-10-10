/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.gtfs.model;

import java.util.Map;

public class Agency {
    final public String agency_id;
    final public String agency_name;
    final public String agency_url;
    final public String agency_timezone;
    final public String agency_lang;
    final public String agency_phone;
    final public String agency_fare_url;

    public Agency(Map<String, String> row) {
        agency_id = row.get("agency_id");
        agency_name = row.get("agency_name");
        agency_url = row.get("agency_url");
        agency_timezone = row.get("agency_timezone");
        agency_lang = row.get("agency_lang");
        agency_phone = row.get("agency_phone");
        agency_fare_url = row.get("agency_fare_url");
    }
}
