package org.gwtbootstrap3.client.ui.base.form;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.FileUpload;
import org.gwtbootstrap3.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import org.gwtbootstrap3.client.ui.base.HasResponsiveness;
import org.gwtbootstrap3.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap3.client.ui.constants.DeviceSize;
import org.gwtbootstrap3.client.ui.constants.Styles;

/**
 * Base class for {@link org.gwtbootstrap3.client.ui.Form} related
 * widgets that may contain form input elements.
 * <p/>
 * Input elements styleName is adjusted during
 * {@link #add(com.google.gwt.user.client.ui.Widget)}.
 *
 * @author Sven Jacobs
 * @author Joshua Godi
 */
public abstract class FormElementContainer extends ComplexPanel implements HasResponsiveness {

    @Override
    public void add(final Widget w) {
        if (w instanceof ListBox || w instanceof FileUpload) {
            w.addStyleName(Styles.FORM_CONTROL);
        }
        add(w, (Element) getElement());
    }

    @Override
    public void setVisibleOn(final DeviceSize deviceSize) {
        StyleHelper.setVisibleOn(this, deviceSize);
    }

    @Override
    public void setHiddenOn(final DeviceSize deviceSize) {
        StyleHelper.setHiddenOn(this, deviceSize);
    }
}
