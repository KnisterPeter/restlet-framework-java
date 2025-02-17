/**
 * Copyright 2005-2014 Restlet
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package org.restlet.ext.swagger.internal.info;

import org.restlet.data.Language;

/**
 * Document APISpark description elements.
 * 
 * @author Jerome Louvel
 */
public class DocumentationInfo {

    /** The language of that documentation element. */
    private Language language;

    /** The content as a String. */
    private String textContent;

    /** The title of that documentation element. */
    private String title;

    /**
     * Constructor.
     */
    public DocumentationInfo() {
        super();
    }

    /**
     * Constructor with text content.
     * 
     * @param textContent
     *            The text content.
     */
    public DocumentationInfo(String textContent) {
        super();
        setTextContent(textContent);
    }

    /**
     * Returns the language of that documentation element.
     * 
     * @return The language of this documentation element.
     */
    public Language getLanguage() {
        return this.language;
    }

    /**
     * Returns the language of that documentation element.
     * 
     * @return The content of that element as text.
     */
    public String getTextContent() {
        return this.textContent;
    }

    /**
     * Returns the title of that documentation element.
     * 
     * @return The title of that documentation element.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * The language of that documentation element.
     * 
     * @param language
     *            The language of that documentation element.
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * Sets the content of that element as text.
     * 
     * @param textContent
     *            The content of that element as text.
     */
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    /**
     * Sets the title of that documentation element.
     * 
     * @param title
     *            The title of that documentation element.
     */
    public void setTitle(String title) {
        this.title = title;
    }

}
