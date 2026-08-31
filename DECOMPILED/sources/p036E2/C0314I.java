package p036E2;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcuw;
import com.google.android.gms.internal.ads.zzcux;
import com.google.android.gms.internal.ads.zzcvj;
import com.google.android.gms.internal.ads.zzdeo;
import com.google.android.gms.internal.ads.zzdru;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqf;
import com.google.android.gms.internal.ads.zzhqg;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: renamed from: E2.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0314I implements zzhpx {

    /* JADX INFO: renamed from: a */
    private final zzhqg f1301a;

    /* JADX INFO: renamed from: b */
    private final zzhqg f1302b;

    /* JADX INFO: renamed from: c */
    private final zzhqg f1303c;

    /* JADX INFO: renamed from: d */
    private final zzhqg f1304d;

    /* JADX INFO: renamed from: e */
    private final zzhqg f1305e;

    /* JADX INFO: renamed from: f */
    private final zzhqg f1306f;

    /* JADX INFO: renamed from: g */
    private final zzhqg f1307g;

    /* JADX INFO: renamed from: h */
    private final zzhqg f1308h;

    /* JADX INFO: renamed from: i */
    private final zzhqg f1309i;

    private C0314I(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9) {
        this.f1301a = zzhqgVar;
        this.f1302b = zzhqgVar2;
        this.f1303c = zzhqgVar3;
        this.f1304d = zzhqgVar4;
        this.f1305e = zzhqgVar5;
        this.f1306f = zzhqgVar6;
        this.f1307g = zzhqgVar7;
        this.f1308h = zzhqgVar8;
        this.f1309i = zzhqgVar9;
    }

    /* JADX INFO: renamed from: a */
    public static C0314I m1493a(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9) {
        return new C0314I(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceFutureC1673e interfaceFutureC1673eZzi;
        BinderC0375w binderC0375w = (BinderC0375w) this.f1301a.zzb();
        zzfhh zzfhhVar = (zzfhh) this.f1302b.zzb();
        C0316K c0316kZzb = ((C0317L) this.f1303c).zzb();
        zzcuw zzcuwVarZzb = ((zzcux) this.f1304d).zzb();
        zzdeo zzdeoVar = (zzdeo) this.f1305e.zzb();
        C0308C c0308c = (C0308C) this.f1306f.zzb();
        zzbyi zzbyiVar = (zzbyi) this.f1307g.zzb();
        int iIntValue = ((Integer) this.f1308h.zzb()).intValue();
        Bundle bundle = ((zzcvj) this.f1309i).zza().zzt;
        C0318M c0318mM1486b = null;
        if (iIntValue == 1 && zzbyiVar != null) {
            bundle.putLong(zzdru.READ_FROM_DISK_START.zza(), C7351t.m32357o().mo18159a());
            c0318mM1486b = c0308c.m1486b(zzbyiVar, binderC0375w, bundle);
            bundle.putLong(zzdru.READ_FROM_DISK_END.zza(), C7351t.m32357o().mo18159a());
        }
        if (c0318mM1486b != null) {
            zzdeoVar.zza(c0318mM1486b);
            interfaceFutureC1673eZzi = zzgot.zza(c0318mM1486b);
        } else {
            interfaceFutureC1673eZzi = zzfhhVar.zza(zzfhb.GENERATE_SIGNALS, zzcuwVarZzb.zzb()).zzc(c0316kZzb).zzh(((Integer) C3250D.m17200c().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS).zzi();
            zzgot.zzq(interfaceFutureC1673eZzi, new C0377y(zzdeoVar), zzbzh.zza);
        }
        zzhqf.zzb(interfaceFutureC1673eZzi);
        return interfaceFutureC1673eZzi;
    }
}
