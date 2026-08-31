package p107N2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC3734a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: N2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0949b extends zzbz {
    public static final Parcelable.Creator<C0949b> CREATOR = new C0950c();

    /* JADX INFO: renamed from: f */
    private static final HashMap f3664f;

    /* JADX INFO: renamed from: a */
    final Set f3665a;

    /* JADX INFO: renamed from: b */
    final int f3666b;

    /* JADX INFO: renamed from: c */
    private ArrayList f3667c;

    /* JADX INFO: renamed from: d */
    private int f3668d;

    /* JADX INFO: renamed from: e */
    private C0952e f3669e;

    static {
        HashMap map = new HashMap();
        f3664f = map;
        map.put("authenticatorData", AbstractC3734a.a.m18120V("authenticatorData", 2, C0954g.class));
        map.put("progress", AbstractC3734a.a.m18119U("progress", 4, C0952e.class));
    }

    C0949b(Set set, int i7, ArrayList arrayList, int i8, C0952e c0952e) {
        this.f3665a = set;
        this.f3666b = i7;
        this.f3667c = arrayList;
        this.f3668d = i8;
        this.f3669e = c0952e;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final void addConcreteTypeArrayInternal(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(iM18125Z), arrayList.getClass().getCanonicalName()));
        }
        this.f3667c = arrayList;
        this.f3665a.add(Integer.valueOf(iM18125Z));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final void addConcreteTypeInternal(AbstractC3734a.a aVar, String str, AbstractC3734a abstractC3734a) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(iM18125Z), abstractC3734a.getClass().getCanonicalName()));
        }
        this.f3669e = (C0952e) abstractC3734a;
        this.f3665a.add(Integer.valueOf(iM18125Z));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final /* synthetic */ Map getFieldMappings() {
        return f3664f;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final Object getFieldValue(AbstractC3734a.a aVar) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z == 1) {
            return Integer.valueOf(this.f3666b);
        }
        if (iM18125Z == 2) {
            return this.f3667c;
        }
        if (iM18125Z == 4) {
            return this.f3669e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m18125Z());
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final boolean isFieldSet(AbstractC3734a.a aVar) {
        return this.f3665a.contains(Integer.valueOf(aVar.m18125Z()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        Set set = this.f3665a;
        if (set.contains(1)) {
            AbstractC1947c.m8072t(parcel, 1, this.f3666b);
        }
        if (set.contains(2)) {
            AbstractC1947c.m8048I(parcel, 2, this.f3667c, true);
        }
        if (set.contains(3)) {
            AbstractC1947c.m8072t(parcel, 3, this.f3668d);
        }
        if (set.contains(4)) {
            AbstractC1947c.m8042C(parcel, 4, this.f3669e, i7, true);
        }
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
