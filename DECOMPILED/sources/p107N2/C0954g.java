package p107N2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC3734a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: N2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0954g extends zzbz {
    public static final Parcelable.Creator<C0954g> CREATOR = new C0955h();

    /* JADX INFO: renamed from: r */
    private static final HashMap f3677r;

    /* JADX INFO: renamed from: a */
    final Set f3678a;

    /* JADX INFO: renamed from: b */
    final int f3679b;

    /* JADX INFO: renamed from: c */
    private C0956i f3680c;

    /* JADX INFO: renamed from: d */
    private String f3681d;

    /* JADX INFO: renamed from: e */
    private String f3682e;

    /* JADX INFO: renamed from: f */
    private String f3683f;

    static {
        HashMap map = new HashMap();
        f3677r = map;
        map.put("authenticatorInfo", AbstractC3734a.a.m18119U("authenticatorInfo", 2, C0956i.class));
        map.put("signature", AbstractC3734a.a.m18122X("signature", 3));
        map.put("package", AbstractC3734a.a.m18122X("package", 4));
    }

    C0954g(Set set, int i7, C0956i c0956i, String str, String str2, String str3) {
        this.f3678a = set;
        this.f3679b = i7;
        this.f3680c = c0956i;
        this.f3681d = str;
        this.f3682e = str2;
        this.f3683f = str3;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final void addConcreteTypeInternal(AbstractC3734a.a aVar, String str, AbstractC3734a abstractC3734a) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(iM18125Z), abstractC3734a.getClass().getCanonicalName()));
        }
        this.f3680c = (C0956i) abstractC3734a;
        this.f3678a.add(Integer.valueOf(iM18125Z));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final /* synthetic */ Map getFieldMappings() {
        return f3677r;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final Object getFieldValue(AbstractC3734a.a aVar) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z == 1) {
            return Integer.valueOf(this.f3679b);
        }
        if (iM18125Z == 2) {
            return this.f3680c;
        }
        if (iM18125Z == 3) {
            return this.f3681d;
        }
        if (iM18125Z == 4) {
            return this.f3682e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m18125Z());
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final boolean isFieldSet(AbstractC3734a.a aVar) {
        return this.f3678a.contains(Integer.valueOf(aVar.m18125Z()));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setStringInternal(AbstractC3734a.a aVar, String str, String str2) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z == 3) {
            this.f3681d = str2;
        } else {
            if (iM18125Z != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(iM18125Z)));
            }
            this.f3682e = str2;
        }
        this.f3678a.add(Integer.valueOf(iM18125Z));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        Set set = this.f3678a;
        if (set.contains(1)) {
            AbstractC1947c.m8072t(parcel, 1, this.f3679b);
        }
        if (set.contains(2)) {
            AbstractC1947c.m8042C(parcel, 2, this.f3680c, i7, true);
        }
        if (set.contains(3)) {
            AbstractC1947c.m8044E(parcel, 3, this.f3681d, true);
        }
        if (set.contains(4)) {
            AbstractC1947c.m8044E(parcel, 4, this.f3682e, true);
        }
        if (set.contains(5)) {
            AbstractC1947c.m8044E(parcel, 5, this.f3683f, true);
        }
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
