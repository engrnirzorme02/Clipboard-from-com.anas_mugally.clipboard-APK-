package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.C2390a;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzpu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b */
/* JADX INFO: loaded from: classes2.dex */
final class C4190b extends AbstractC4198c {

    /* JADX INFO: renamed from: g */
    private final zzff f15551g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ C4214e f15552h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4190b(C4214e c4214e, String str, int i7, zzff zzffVar) {
        super(str, i7);
        Objects.requireNonNull(c4214e);
        this.f15552h = c4214e;
        this.f15551g = zzffVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4198c
    /* JADX INFO: renamed from: a */
    final int mo18690a() {
        return this.f15551g.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4198c
    /* JADX INFO: renamed from: b */
    final boolean mo18691b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4198c
    /* JADX INFO: renamed from: c */
    final boolean mo18692c() {
        return this.f15551g.zzg();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0285  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x0299  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:121:0x030a A[EDGE_INSN: B:121:0x030a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121]] */
    /* JADX WARN: Code duplicated, block: B:122:0x032a A[EDGE_INSN: B:122:0x032a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x034a A[EDGE_INSN: B:176:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x034a A[EDGE_INSN: B:178:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x034a A[EDGE_INSN: B:187:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[LOOP:0: B:40:0x00f4->B:45:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:86:0x022e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0240  */
    /* JADX WARN: Code duplicated, block: B:97:0x0273  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    final boolean m18693k(Long l7, Long l8, zzhs zzhsVar, long j7, C4007C c4007c, boolean z7) {
        HashSet hashSet;
        Iterator it;
        C2390a c2390a;
        Iterator it2;
        Iterator it3;
        zzfh zzfhVar;
        boolean z8;
        String strZzh;
        Object obj;
        Boolean boolM18701g;
        Boolean boolM18702h;
        String str;
        Boolean boolM18703i;
        zzhw zzhwVar;
        Long lValueOf;
        Double dValueOf;
        zzfh zzfhVar2;
        zzpu.zza();
        C4214e c4214e = this.f15552h;
        C4164X2 c4164x2 = c4214e.f15066a;
        C4278m c4278mM18686w = c4164x2.m18686w();
        String str2 = this.f15566a;
        boolean zM18800H = c4278mM18686w.m18800H(str2, AbstractC4209d2.f15609G0);
        zzff zzffVar = this.f15551g;
        long j8 = zzffVar.zzm() ? c4007c.f15131e : j7;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(c4164x2.mo18421a().m18861z(), 2)) {
            c4164x2.mo18421a().m18859w().m18837d("Evaluating filter. audience, filter, event", Integer.valueOf(this.f15567b), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null, c4164x2.m18662D().m18775a(zzffVar.zzc()));
            c4164x2.mo18421a().m18859w().m18835b("Filter definition", c4214e.f15465b.m18903K0().m19091L(zzffVar));
        }
        if (!zzffVar.zza() || zzffVar.zzb() > 256) {
            c4164x2.mo18421a().m18854r().m18836c("Invalid event filter ID. appId, id", C4313q2.m18846x(str2), String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
            return false;
        }
        Object[] objArr = zzffVar.zzi() || zzffVar.zzj() || zzffVar.zzm();
        if (z7 && objArr != true) {
            c4164x2.mo18421a().m18859w().m18836c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f15567b), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
            return true;
        }
        String strZzd = zzhsVar.zzd();
        if (!zzffVar.zzg()) {
            hashSet = new HashSet();
            it = zzffVar.zzd().iterator();
            while (true) {
                if (it.hasNext()) {
                    c2390a = new C2390a();
                    it2 = zzhsVar.zza().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzffVar.zzd().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzfhVar = (zzfh) it3.next();
                                if (zzfhVar.zze() || !zzfhVar.zzf()) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                strZzh = zzfhVar.zzh();
                                if (strZzh.isEmpty()) {
                                    obj = c2390a.get(strZzh);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                if (obj == null) {
                                                    c4164x2.mo18421a().m18854r().m18836c("Unknown param type. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                    break;
                                                }
                                                c4164x2.mo18421a().m18859w().m18836c("Missing param for filter. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (zzfhVar.zza()) {
                                                if (zzfhVar.zzc()) {
                                                    c4164x2.mo18421a().m18854r().m18836c("No filter for String param. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (C4349u6.m19068O(str)) {
                                                    c4164x2.mo18421a().m18854r().m18836c("Invalid param value for number filter. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                    break;
                                                }
                                                boolM18703i = AbstractC4198c.m18703i(str, zzfhVar.zzd());
                                            } else {
                                                boolM18703i = AbstractC4198c.m18700f((String) obj, zzfhVar.zzb(), c4164x2.mo18421a());
                                            }
                                            if (boolM18703i != null) {
                                                break;
                                            }
                                            if (boolM18703i.booleanValue() == z8) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (zzfhVar.zzc()) {
                                                c4164x2.mo18421a().m18854r().m18836c("No number filter for double param. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                break;
                                            }
                                            boolM18702h = AbstractC4198c.m18702h(((Double) obj).doubleValue(), zzfhVar.zzd());
                                            if (boolM18702h != null) {
                                                break;
                                            }
                                            if (boolM18702h.booleanValue() == z8) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (zzfhVar.zzc()) {
                                            c4164x2.mo18421a().m18854r().m18836c("No number filter for long param. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                            break;
                                        }
                                        boolM18701g = AbstractC4198c.m18701g(((Long) obj).longValue(), zzfhVar.zzd());
                                        if (boolM18701g != null) {
                                            break;
                                        }
                                        if (boolM18701g.booleanValue() == z8) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    c4164x2.mo18421a().m18854r().m18835b("Event has empty param name. event", c4164x2.m18662D().m18775a(strZzd));
                                    break;
                                }
                            }
                        } else {
                            zzhwVar = (zzhw) it2.next();
                            if (!hashSet.contains(zzhwVar.zzb())) {
                                if (zzhwVar.zze()) {
                                    if (zzhwVar.zzi()) {
                                        if (zzhwVar.zzc()) {
                                            c4164x2.mo18421a().m18854r().m18836c("Unknown value for param. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(zzhwVar.zzb()));
                                            break;
                                        }
                                        c2390a.put(zzhwVar.zzb(), zzhwVar.zzd());
                                    } else {
                                        String strZzb = zzhwVar.zzb();
                                        if (zzhwVar.zzi()) {
                                            dValueOf = Double.valueOf(zzhwVar.zzj());
                                        } else {
                                            dValueOf = null;
                                        }
                                        c2390a.put(strZzb, dValueOf);
                                    }
                                } else {
                                    String strZzb2 = zzhwVar.zzb();
                                    if (zzhwVar.zze()) {
                                        lValueOf = Long.valueOf(zzhwVar.zzf());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c2390a.put(strZzb2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    zzfhVar2 = (zzfh) it.next();
                    if (zzfhVar2.zzh().isEmpty()) {
                        c4164x2.mo18421a().m18854r().m18835b("null or empty param name in filter. event", c4164x2.m18662D().m18775a(strZzd));
                        break;
                    }
                    hashSet.add(zzfhVar2.zzh());
                }
            }
        } else {
            Boolean boolM18701g2 = AbstractC4198c.m18701g(j8, zzffVar.zzh());
            if (boolM18701g2 != null) {
                if (boolM18701g2.booleanValue()) {
                    hashSet = new HashSet();
                    it = zzffVar.zzd().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c2390a = new C2390a();
                            it2 = zzhsVar.zza().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = zzffVar.zzd().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        zzfhVar = (zzfh) it3.next();
                                        if (zzfhVar.zze()) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                        strZzh = zzfhVar.zzh();
                                        if (strZzh.isEmpty()) {
                                            obj = c2390a.get(strZzh);
                                            if (obj instanceof Long) {
                                                if (obj instanceof Double) {
                                                    if (obj instanceof String) {
                                                        if (obj == null) {
                                                            c4164x2.mo18421a().m18854r().m18836c("Unknown param type. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                            break;
                                                        }
                                                        c4164x2.mo18421a().m18859w().m18836c("Missing param for filter. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (zzfhVar.zza()) {
                                                        if (zzfhVar.zzc()) {
                                                            c4164x2.mo18421a().m18854r().m18836c("No filter for String param. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                            break;
                                                        }
                                                        str = (String) obj;
                                                        if (C4349u6.m19068O(str)) {
                                                            c4164x2.mo18421a().m18854r().m18836c("Invalid param value for number filter. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                            break;
                                                        }
                                                        boolM18703i = AbstractC4198c.m18703i(str, zzfhVar.zzd());
                                                    } else {
                                                        boolM18703i = AbstractC4198c.m18700f((String) obj, zzfhVar.zzb(), c4164x2.mo18421a());
                                                    }
                                                    if (boolM18703i != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolM18703i.booleanValue() == z8) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (zzfhVar.zzc()) {
                                                    boolM18702h = AbstractC4198c.m18702h(((Double) obj).doubleValue(), zzfhVar.zzd());
                                                    if (boolM18702h != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolM18702h.booleanValue() == z8) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    c4164x2.mo18421a().m18854r().m18836c("No number filter for double param. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                    break;
                                                }
                                            } else if (zzfhVar.zzc()) {
                                                boolM18701g = AbstractC4198c.m18701g(((Long) obj).longValue(), zzfhVar.zzd());
                                                if (boolM18701g != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolM18701g.booleanValue() == z8) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                c4164x2.mo18421a().m18854r().m18836c("No number filter for long param. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(strZzh));
                                                break;
                                            }
                                        } else {
                                            c4164x2.mo18421a().m18854r().m18835b("Event has empty param name. event", c4164x2.m18662D().m18775a(strZzd));
                                            break;
                                        }
                                    }
                                } else {
                                    zzhwVar = (zzhw) it2.next();
                                    if (!hashSet.contains(zzhwVar.zzb())) {
                                        if (zzhwVar.zze()) {
                                            if (zzhwVar.zzi()) {
                                                if (zzhwVar.zzc()) {
                                                    c4164x2.mo18421a().m18854r().m18836c("Unknown value for param. event, param", c4164x2.m18662D().m18775a(strZzd), c4164x2.m18662D().m18776b(zzhwVar.zzb()));
                                                    break;
                                                }
                                                c2390a.put(zzhwVar.zzb(), zzhwVar.zzd());
                                            } else {
                                                String strZzb3 = zzhwVar.zzb();
                                                if (zzhwVar.zzi()) {
                                                    dValueOf = Double.valueOf(zzhwVar.zzj());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                c2390a.put(strZzb3, dValueOf);
                                            }
                                        } else {
                                            String strZzb4 = zzhwVar.zzb();
                                            if (zzhwVar.zze()) {
                                                lValueOf = Long.valueOf(zzhwVar.zzf());
                                            } else {
                                                lValueOf = null;
                                            }
                                            c2390a.put(strZzb4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            zzfhVar2 = (zzfh) it.next();
                            if (zzfhVar2.zzh().isEmpty()) {
                                c4164x2.mo18421a().m18854r().m18835b("null or empty param name in filter. event", c4164x2.m18662D().m18775a(strZzd));
                                break;
                            }
                            hashSet.add(zzfhVar2.zzh());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        c4164x2.mo18421a().m18859w().m18835b("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f15568c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f15569d = bool2;
        if (objArr != false && zzhsVar.zze()) {
            Long lValueOf2 = Long.valueOf(zzhsVar.zzf());
            if (zzffVar.zzj()) {
                if (zM18800H && zzffVar.zzg()) {
                    lValueOf2 = l7;
                }
                this.f15571f = lValueOf2;
            } else {
                if (zM18800H && zzffVar.zzg()) {
                    lValueOf2 = l8;
                }
                this.f15570e = lValueOf2;
            }
        }
        return true;
    }
}
