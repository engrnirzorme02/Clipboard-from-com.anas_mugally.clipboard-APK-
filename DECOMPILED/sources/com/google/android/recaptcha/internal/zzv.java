package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import p145S5.AbstractC1437o;
import p145S5.C1434l;
import p145S5.C1436n;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1638q;
import p170W2.C1841f;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p278j6.AbstractC5905g;
import p318o6.AbstractC6626O;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv extends zze {
    private final zzek zza;
    private final List zzb;
    private zzle zzc;
    private final Map zzd;

    public /* synthetic */ zzv(Context context, zzek zzekVar, zzbi zzbiVar, List list, int i7, AbstractC6112h abstractC6112h) {
        zzab zzabVar = new zzab(zzekVar.zza());
        zzp zzpVar = new zzp(zzekVar.zza());
        zzm zzmVar = new zzm(zzekVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzekVar.zza());
        zzek zzekVarZza = zzekVar.zza();
        InterfaceC6624N interfaceC6624NZzc = zzbiVar.zzc();
        List listL = AbstractC1638q.m6767l(zzabVar, zzpVar, zzmVar, zznVar, new zzae(zzekVarZza, context, interfaceC6624NZzc, new zzan(context, interfaceC6624NZzc, zzekVarZza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbs(C1841f.m7623f())));
        this.zza = zzekVar;
        this.zzb = listL;
        this.zzd = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsi zzq(String str) {
        Map mapH;
        List<zzaa> list = (List) this.zzd.remove(str);
        if (list != null) {
            mapH = new LinkedHashMap(AbstractC5905g.m26654b(AbstractC1610H.m6623e(AbstractC1638q.m6774s(list, 10)), 16));
            for (zzaa zzaaVar : list) {
                mapH.put(Integer.valueOf(zzaaVar.zzb()), zzaaVar);
            }
        } else {
            mapH = AbstractC1610H.m6626h();
        }
        zzsz zzszVarZzs = zzs(mapH, str);
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        zzsf zzsfVarZzf = zzsg.zzf();
        byte[] bArrZzd = zzszVarZzs.zzd();
        zzsfVarZzf.zze(zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        zzshVarZzf.zzf(zzsfVarZzf);
        return (zzsi) zzshVarZzf.zzk();
    }

    private final zzsx zzr(zzaa zzaaVar) {
        zzle zzleVar;
        zzsv zzsvVarZzf = zzsx.zzf();
        zzsvVarZzf.zzq(3);
        if (zzaaVar instanceof zzx) {
            zzti zztiVarZza = ((zzx) zzaaVar).zza();
            zzle zzleVar2 = this.zzc;
            zzleVar = zzleVar2 != null ? zzleVar2 : null;
            byte[] bArrZzd = zztiVarZza.zzd();
            zzsvVarZzf.zzf(zzcf.zza(zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzleVar));
        } else {
            if (!(zzaaVar instanceof zzw)) {
                throw new C1434l();
            }
            zzte zzteVarZza = ((zzw) zzaaVar).zza();
            zzle zzleVar3 = this.zzc;
            zzleVar = zzleVar3 != null ? zzleVar3 : null;
            byte[] bArrZzd2 = zzteVarZza.zzd();
            zzsvVarZzf.zze(zzcf.zza(zzkh.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), zzleVar));
        }
        return (zzsx) zzsvVarZzf.zzk();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzsyVarZzf = zzsz.zzf();
        zzsyVarZzf.zzq(str);
        List list = this.zzb;
        ArrayList<zzy> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzy) obj).zzf()) {
                arrayList.add(obj);
            }
        }
        for (zzy zzyVar : arrayList) {
            if (!map.containsKey(Integer.valueOf(zzyVar.zza()))) {
                int iZza = zzyVar.zza();
                zztd zztdVarZzf = zzte.zzf();
                zztdVarZzf.zzf(iZza);
                zztdVarZzf.zzr(13);
                zztdVarZzf.zzq(27);
                zzsyVarZzf.zzf(zzr(new zzw(iZza, (zzte) zztdVarZzf.zzk())));
            }
        }
        Collection collectionValues = map.values();
        ArrayList arrayList2 = new ArrayList(AbstractC1638q.m6774s(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzr((zzaa) it.next()));
        }
        zzsyVarZzf.zze(arrayList2);
        return (zzsz) zzsyVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zza(String str) {
        zzek zzekVar = this.zza;
        zzekVar.zzc(str);
        return zzekVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zzb() {
        zzek zzekVar = this.zza;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, InterfaceC1875e interfaceC1875e) {
        return zzq(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzf(String str, InterfaceC1875e interfaceC1875e) {
        zzq zzqVar;
        if (interfaceC1875e instanceof zzq) {
            zzqVar = (zzq) interfaceC1875e;
            int i7 = zzqVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzqVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzqVar = new zzq(this, interfaceC1875e);
            }
        } else {
            zzqVar = new zzq(this, interfaceC1875e);
        }
        Object objM28102e = zzqVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzqVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objM28102e);
            zzs zzsVar = new zzs(this, str, null);
            zzqVar.zzc = 1;
            objM28102e = AbstractC6626O.m28102e(zzsVar, zzqVar);
            if (objM28102e == objE) {
                return objE;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(objM28102e);
        }
        return ((C1436n) objM28102e).m6080i();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzh(zzsc zzscVar, InterfaceC1875e interfaceC1875e) {
        zzt zztVar;
        if (interfaceC1875e instanceof zzt) {
            zztVar = (zzt) interfaceC1875e;
            int i7 = zztVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zztVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zztVar = new zzt(this, interfaceC1875e);
            }
        } else {
            zztVar = new zzt(this, interfaceC1875e);
        }
        Object objM28102e = zztVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zztVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objM28102e);
            zzu zzuVar = new zzu(zzscVar, this, null);
            zztVar.zzc = 1;
            objM28102e = AbstractC6626O.m28102e(zzuVar, zztVar);
            if (objM28102e == objE) {
                return objE;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(objM28102e);
        }
        return ((C1436n) objM28102e).m6080i();
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final void zzk(zzsr zzsrVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzy) it.next()).zze(zzsrVar);
        }
    }

    public final Map zzo() {
        return this.zzd;
    }
}
