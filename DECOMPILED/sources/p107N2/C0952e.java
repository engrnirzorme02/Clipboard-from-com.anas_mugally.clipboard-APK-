package p107N2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C2390a;
import com.google.android.gms.common.server.response.AbstractC3734a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: N2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0952e extends zzbz {
    public static final Parcelable.Creator<C0952e> CREATOR = new C0953f();

    /* JADX INFO: renamed from: r */
    private static final C2390a f3670r;

    /* JADX INFO: renamed from: a */
    final int f3671a;

    /* JADX INFO: renamed from: b */
    private List f3672b;

    /* JADX INFO: renamed from: c */
    private List f3673c;

    /* JADX INFO: renamed from: d */
    private List f3674d;

    /* JADX INFO: renamed from: e */
    private List f3675e;

    /* JADX INFO: renamed from: f */
    private List f3676f;

    static {
        C2390a c2390a = new C2390a();
        f3670r = c2390a;
        c2390a.put("registered", AbstractC3734a.a.m18123Y("registered", 2));
        c2390a.put("in_progress", AbstractC3734a.a.m18123Y("in_progress", 3));
        c2390a.put("success", AbstractC3734a.a.m18123Y("success", 4));
        c2390a.put("failed", AbstractC3734a.a.m18123Y("failed", 5));
        c2390a.put("escrowed", AbstractC3734a.a.m18123Y("escrowed", 6));
    }

    C0952e(int i7, List list, List list2, List list3, List list4, List list5) {
        this.f3671a = i7;
        this.f3672b = list;
        this.f3673c = list2;
        this.f3674d = list3;
        this.f3675e = list4;
        this.f3676f = list5;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final Map getFieldMappings() {
        return f3670r;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final Object getFieldValue(AbstractC3734a.a aVar) {
        switch (aVar.m18125Z()) {
            case 1:
                return Integer.valueOf(this.f3671a);
            case 2:
                return this.f3672b;
            case 3:
                return this.f3673c;
            case 4:
                return this.f3674d;
            case 5:
                return this.f3675e;
            case 6:
                return this.f3676f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m18125Z());
        }
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final boolean isFieldSet(AbstractC3734a.a aVar) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setStringsInternal(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z == 2) {
            this.f3672b = arrayList;
            return;
        }
        if (iM18125Z == 3) {
            this.f3673c = arrayList;
            return;
        }
        if (iM18125Z == 4) {
            this.f3674d = arrayList;
        } else if (iM18125Z == 5) {
            this.f3675e = arrayList;
        } else {
            if (iM18125Z != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(iM18125Z)));
            }
            this.f3676f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f3671a);
        AbstractC1947c.m8046G(parcel, 2, this.f3672b, false);
        AbstractC1947c.m8046G(parcel, 3, this.f3673c, false);
        AbstractC1947c.m8046G(parcel, 4, this.f3674d, false);
        AbstractC1947c.m8046G(parcel, 5, this.f3675e, false);
        AbstractC1947c.m8046G(parcel, 6, this.f3676f, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
