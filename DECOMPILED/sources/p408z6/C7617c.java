package p408z6;

import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: z6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7617c extends AbstractC7618d {

    /* JADX INFO: renamed from: a */
    private final List f30298a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7617c(List missingFields, String str, Throwable th) {
        super(str, th);
        AbstractC6118n.m27187e(missingFields, "missingFields");
        this.f30298a = missingFields;
    }

    /* JADX INFO: renamed from: a */
    public final List m33396a() {
        return this.f30298a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7617c(List missingFields, String serialName) {
        String str;
        AbstractC6118n.m27187e(missingFields, "missingFields");
        AbstractC6118n.m27187e(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + ((String) missingFields.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }
}
