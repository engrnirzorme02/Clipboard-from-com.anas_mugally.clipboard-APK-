package com.google.android.gms.measurement.internal;

import androidx.collection.C2390a;
import com.google.android.gms.internal.measurement.zzhf;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzij;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzpu;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.I6 */
/* JADX INFO: loaded from: classes2.dex */
final class C4062I6 {

    /* JADX INFO: renamed from: a */
    private String f15259a;

    /* JADX INFO: renamed from: b */
    private boolean f15260b;

    /* JADX INFO: renamed from: c */
    private zzii f15261c;

    /* JADX INFO: renamed from: d */
    private BitSet f15262d;

    /* JADX INFO: renamed from: e */
    private BitSet f15263e;

    /* JADX INFO: renamed from: f */
    private Map f15264f;

    /* JADX INFO: renamed from: g */
    private Map f15265g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ C4214e f15266h;

    /* synthetic */ C4062I6(C4214e c4214e, String str, zzii zziiVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(c4214e);
        this.f15266h = c4214e;
        this.f15259a = str;
        this.f15262d = bitSet;
        this.f15263e = bitSet2;
        this.f15264f = map;
        this.f15265g = new C2390a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f15265g.put(num, arrayList);
        }
        this.f15260b = false;
        this.f15261c = zziiVar;
    }

    /* JADX INFO: renamed from: a */
    final void m18532a(AbstractC4198c abstractC4198c) {
        int iMo18690a = abstractC4198c.mo18690a();
        if (abstractC4198c.f15568c != null) {
            this.f15263e.set(iMo18690a, true);
        }
        Boolean bool = abstractC4198c.f15569d;
        if (bool != null) {
            this.f15262d.set(iMo18690a, bool.booleanValue());
        }
        if (abstractC4198c.f15570e != null) {
            Map map = this.f15264f;
            Integer numValueOf = Integer.valueOf(iMo18690a);
            Long l7 = (Long) map.get(numValueOf);
            long jLongValue = abstractC4198c.f15570e.longValue() / 1000;
            if (l7 == null || jLongValue > l7.longValue()) {
                this.f15264f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (abstractC4198c.f15571f != null) {
            Map map2 = this.f15265g;
            Integer numValueOf2 = Integer.valueOf(iMo18690a);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f15265g.put(numValueOf2, arrayList);
            }
            if (abstractC4198c.mo18691b()) {
                arrayList.clear();
            }
            zzpu.zza();
            C4164X2 c4164x2 = this.f15266h.f15066a;
            C4278m c4278mM18686w = c4164x2.m18686w();
            String str = this.f15259a;
            C4201c2 c4201c2 = AbstractC4209d2.f15609G0;
            if (c4278mM18686w.m18800H(str, c4201c2) && abstractC4198c.mo18692c()) {
                arrayList.clear();
            }
            zzpu.zza();
            if (!c4164x2.m18686w().m18800H(this.f15259a, c4201c2)) {
                arrayList.add(Long.valueOf(abstractC4198c.f15571f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(abstractC4198c.f15571f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* JADX INFO: renamed from: b */
    final zzhg m18533b(int i7) {
        ArrayList arrayList;
        List list;
        zzhf zzhfVarZzh = zzhg.zzh();
        zzhfVarZzh.zza(i7);
        zzhfVarZzh.zzd(this.f15260b);
        zzii zziiVar = this.f15261c;
        if (zziiVar != null) {
            zzhfVarZzh.zzc(zziiVar);
        }
        zzih zzihVarZzi = zzii.zzi();
        zzihVarZzi.zzc(C4349u6.m19070Q(this.f15262d));
        zzihVarZzi.zza(C4349u6.m19070Q(this.f15263e));
        Map map = this.f15264f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f15264f.keySet()) {
                int iIntValue = num.intValue();
                Long l7 = (Long) this.f15264f.get(num);
                if (l7 != null) {
                    zzhp zzhpVarZze = zzhq.zze();
                    zzhpVarZze.zza(iIntValue);
                    zzhpVarZze.zzb(l7.longValue());
                    arrayList2.add((zzhq) zzhpVarZze.zzbc());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzihVarZzi.zze(arrayList);
        }
        Map map2 = this.f15265g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f15265g.keySet()) {
                zzij zzijVarZzf = zzik.zzf();
                zzijVarZzf.zza(num2.intValue());
                List list2 = (List) this.f15265g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzijVarZzf.zzb(list2);
                }
                arrayList3.add((zzik) zzijVarZzf.zzbc());
            }
            list = arrayList3;
        }
        zzihVarZzi.zzg(list);
        zzhfVarZzh.zzb(zzihVarZzi);
        return (zzhg) zzhfVarZzh.zzbc();
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BitSet m18534c() {
        return this.f15262d;
    }

    /* synthetic */ C4062I6(C4214e c4214e, String str, byte[] bArr) {
        Objects.requireNonNull(c4214e);
        this.f15266h = c4214e;
        this.f15259a = str;
        this.f15260b = true;
        this.f15262d = new BitSet();
        this.f15263e = new BitSet();
        this.f15264f = new C2390a();
        this.f15265g = new C2390a();
    }
}
