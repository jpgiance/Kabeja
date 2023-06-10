/*
   Copyright 2023 Jorge Prado

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package org.kabeja.parser.entities;

import org.kabeja.dxf.DXFDocument;
import org.kabeja.dxf.DXFEntity;
import org.kabeja.dxf.DXFPoint;
import org.kabeja.dxf.helpers.Point;
import org.kabeja.parser.DXFValue;

public class DXFPointHandler extends AbstractEntityHandler {
    public final static String ENTITY_NAME = "POINT";

    private DXFPoint point;
    private DXFDocument doc;
    private String layerID = "";

    public DXFPointHandler() {
    }

    public String getDXFEntityName() {
        return ENTITY_NAME;
    }

    public void parseGroup(int groupCode, DXFValue value) {
        switch (groupCode) {
            case GROUPCODE_START_X:
                point.setX(value.getDoubleValue());

                break;

            case GROUPCODE_START_Y:
                point.setY(value.getDoubleValue());

                break;

            case GROUPCODE_START_Z:
                point.setZ(value.getDoubleValue());

                break;

        }

        super.parseCommonProperty(groupCode, value, point);
    }

    public DXFEntity getDXFEntity() {
        return point;
    }

    public void startDXFEntity() {
        point = new DXFPoint(0.0, 0.0, 0.0);
    }

    public void endDXFEntity() {
    }

    public void setDXFDocument(DXFDocument doc) {
        this.doc = doc;
    }

    public boolean isFollowSequence() {
        return false;
    }

}