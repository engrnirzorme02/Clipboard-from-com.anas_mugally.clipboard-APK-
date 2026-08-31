package p199a3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.AbstractC3734a;
import java.util.ArrayList;
import java.util.HashMap;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: a3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2196a extends AbstractC1945a implements AbstractC3734a.b {
    public static final Parcelable.Creator<C2196a> CREATOR = new C2200e();

    /* JADX INFO: renamed from: a */
    final int f7125a;

    /* JADX INFO: renamed from: b */
    private final HashMap f7126b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final SparseArray f7127c = new SparseArray();

    C2196a(int i7, ArrayList arrayList) {
        this.f7125a = i7;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C2199d c2199d = (C2199d) arrayList.get(i8);
            m8935T(c2199d.f7131b, c2199d.f7132c);
        }
    }

    /* JADX INFO: renamed from: T */
    public C2196a m8935T(String str, int i7) {
        this.f7126b.put(str, Integer.valueOf(i7));
        this.f7127c.put(i7, str);
        return this;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a.b
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo8936b(Object obj) {
        String str = (String) this.f7127c.get(((Integer) obj).intValue());
        return (str == null && this.f7126b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a.b
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo8937e(Object obj) {
        Integer num = (Integer) this.f7126b.get((String) obj);
        return num == null ? (Integer) this.f7126b.get("gms_unknown") : num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f7125a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f7126b.keySet()) {
            arrayList.add(new C2199d(str, ((Integer) this.f7126b.get(str)).intValue()));
        }
        AbstractC1947c.m8048I(parcel, 2, arrayList, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
