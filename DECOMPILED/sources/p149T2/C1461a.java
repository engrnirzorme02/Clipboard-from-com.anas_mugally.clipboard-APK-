package p149T2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: T2.a */
/* JADX INFO: loaded from: classes.dex */
public class C1461a extends AbstractC1945a {
    public static final Parcelable.Creator<C1461a> CREATOR = new C1466f();

    /* JADX INFO: renamed from: a */
    private final List f4999a;

    /* JADX INFO: renamed from: b */
    private final boolean f5000b;

    C1461a(List list, boolean z7) {
        if (z7) {
            boolean z8 = true;
            if (list != null && !list.isEmpty()) {
                z8 = false;
            }
            AbstractC3718s.m18087p(z8, "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f5000b = z7;
        this.f4999a = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractC3718s.m18078g(str, "Element in keys cannot be null or empty");
                this.f4999a.add(str);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public boolean m6123T() {
        return this.f5000b;
    }

    /* JADX INFO: renamed from: U */
    public List m6124U() {
        return Collections.unmodifiableList(this.f4999a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8046G(parcel, 1, m6124U(), false);
        AbstractC1947c.m8059g(parcel, 2, m6123T());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
