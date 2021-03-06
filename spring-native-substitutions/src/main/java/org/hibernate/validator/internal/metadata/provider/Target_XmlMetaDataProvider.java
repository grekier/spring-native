package org.hibernate.validator.internal.metadata.provider;

import com.oracle.svm.core.annotate.Delete;
import com.oracle.svm.core.annotate.TargetClass;

import org.springframework.nativex.substitutions.OnlyIfPresent;
import org.springframework.nativex.substitutions.RemoveXmlSupport;

@TargetClass(className = "org.hibernate.validator.internal.metadata.provider.XmlMetaDataProvider", onlyWith = { OnlyIfPresent.class, RemoveXmlSupport.class })
@Delete
final class Target_XmlMetaDataProvider {
}
