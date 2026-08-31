package p044F2;

import android.content.Context;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;
import p404z2.C7584a;

/* JADX INFO: renamed from: F2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0417b implements zzhpx {

    /* JADX INFO: renamed from: a */
    private final zzhqg f1662a;

    /* JADX INFO: renamed from: b */
    private final zzhqg f1663b;

    private C0417b(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.f1662a = zzhqgVar;
        this.f1663b = zzhqgVar2;
    }

    /* JADX INFO: renamed from: a */
    public static C0417b m1805a(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new C0417b(zzhqgVar, zzhqgVar2);
    }

    /* JADX INFO: renamed from: c */
    public static C0416a m1806c(Context context, C7584a c7584a) {
        return new C0416a(context, c7584a);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0416a zzb() {
        return m1806c((Context) this.f1662a.zzb(), (C7584a) this.f1663b.zzb());
    }
}
