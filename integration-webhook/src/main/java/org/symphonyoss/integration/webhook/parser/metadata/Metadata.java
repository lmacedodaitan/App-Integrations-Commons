/**
 * Copyright 2016-2017 Symphony Integrations - Symphony LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.symphonyoss.integration.webhook.parser.metadata;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents the XML document as a whole that contains the metadata objects which be used to
 * generate the EntityJSON.
 *
 * The XML root element has the attributes: name, type and version.
 *
 * The XML document may have a set of <object> tags.
 *
 * Created by rsanchez on 30/03/17.
 */
@XmlRootElement
public class Metadata {

  private String name;

  private String type;

  private String version;

  private List<MetadataField> fields;

  private List<MetadataObject> objects;

  @XmlAttribute
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @XmlAttribute
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @XmlAttribute
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @XmlElement(name = "object")
  public List<MetadataObject> getObjects() {
    return objects;
  }

  public void setObjects(List<MetadataObject> objects) {
    this.objects = objects;
  }

  @XmlElement(name = "field")
  public List<MetadataField> getFields() {
    return fields;
  }

  public void setFields(List<MetadataField> fields) {
    this.fields = fields;
  }

  @Override
  public String toString() {
    return "Metadata{" +
        "name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", version='" + version + '\'' +
        ", objects=" + objects +
        ", fields=" + fields +
        '}';
  }
}
