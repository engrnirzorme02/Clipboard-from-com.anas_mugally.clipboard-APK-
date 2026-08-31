package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.internal.p411firebaseauthapi.zzakz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzakx<T extends zzakz<T>> {
    private static final zzakx<?> zzb = new zzakx<>(true);
    final zzang<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzakx() {
        this.zza = new zzanf();
    }

    static int zza(zzaog zzaogVar, int i7, Object obj) {
        int iZzh = zzakn.zzh(i7);
        if (zzaogVar == zzaog.zzj) {
            zzalh.zza((zzamm) obj);
            iZzh <<= 1;
        }
        return iZzh + zza(zzaogVar, obj);
    }

    public static <T extends zzakz<T>> zzakx<T> zzb() {
        return (zzakx<T>) zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        zzakx zzakxVar = new zzakx();
        int iZzb = this.zza.zzb();
        for (int i7 = 0; i7 < iZzb; i7++) {
            Map.Entry<K, Object> entryZza = this.zza.zza(i7);
            zzakxVar.zzb((zzakz) entryZza.getKey(), entryZza.getValue());
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzakxVar.zzb((zzakz) entry.getKey(), entry.getValue());
        }
        zzakxVar.zzd = this.zzd;
        return zzakxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzakx) {
            return this.zza.equals(((zzakx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzd ? new zzals(this.zza.zzd().iterator()) : this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzd ? new zzals(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int iZzb = this.zza.zzb();
        for (int i7 = 0; i7 < iZzb; i7++) {
            Object value = this.zza.zza(i7).getValue();
            if (value instanceof zzalf) {
                ((zzalf) value).zzt();
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzalf) {
                ((zzalf) value2).zzt();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int iZzb = this.zza.zzb();
        for (int i7 = 0; i7 < iZzb; i7++) {
            if (!zzc(this.zza.zza(i7))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z7 = value instanceof zzalq;
        if (key.zze()) {
            if (z7) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzakz) key);
            List list = (List) value;
            int size = list.size();
            if (objZza == null) {
                objZza = new ArrayList(size);
            }
            List list2 = (List) objZza;
            for (int i7 = 0; i7 < size; i7++) {
                list2.add(zza(list.get(i7)));
            }
            this.zza.put(key, objZza);
            return;
        }
        if (key.zzc() != zzaoj.MESSAGE) {
            if (z7) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(key, zza(value));
            return;
        }
        Object objZza2 = zza((zzakz) key);
        if (objZza2 != null) {
            if (z7) {
                throw new NoSuchMethodError();
            }
            this.zza.put(key, objZza2 instanceof zzamr ? key.zza((zzamr) objZza2, (zzamr) value) : key.zza(((zzamm) objZza2).zzr(), (zzamm) value).zze());
        } else {
            this.zza.put(key, zza(value));
            if (z7) {
                this.zzd = true;
            }
        }
    }

    private zzakx(zzang<T, Object> zzangVar) {
        this.zza = zzangVar;
        zze();
    }

    private static int zza(zzaog zzaogVar, Object obj) {
        switch (zzala.zzb[zzaogVar.ordinal()]) {
            case 1:
                return zzakn.zza(((Double) obj).doubleValue());
            case 2:
                return zzakn.zza(((Float) obj).floatValue());
            case 3:
                return zzakn.zzb(((Long) obj).longValue());
            case 4:
                return zzakn.zze(((Long) obj).longValue());
            case 5:
                return zzakn.zzc(((Integer) obj).intValue());
            case 6:
                return zzakn.zza(((Long) obj).longValue());
            case 7:
                return zzakn.zzb(((Integer) obj).intValue());
            case 8:
                return zzakn.zza(((Boolean) obj).booleanValue());
            case 9:
                return ((zzamm) obj).zzl();
            case 10:
                if (obj instanceof zzalq) {
                    return zzakn.zza((zzalq) obj);
                }
                return zzakn.zza((zzamm) obj);
            case 11:
                if (obj instanceof zzajv) {
                    return zzakn.zza((zzajv) obj);
                }
                return zzakn.zza((String) obj);
            case 12:
                if (obj instanceof zzajv) {
                    return zzakn.zza((zzajv) obj);
                }
                return zzakn.zza((byte[]) obj);
            case 13:
                return zzakn.zzi(((Integer) obj).intValue());
            case 14:
                return zzakn.zzf(((Integer) obj).intValue());
            case 15:
                return zzakn.zzc(((Long) obj).longValue());
            case 16:
                return zzakn.zzg(((Integer) obj).intValue());
            case 17:
                return zzakn.zzd(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzalk) {
                    return zzakn.zza(((zzalk) obj).zza());
                }
                return zzakn.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void zzc(T t7, Object obj) {
        zzaog zzaogVarZzb = t7.zzb();
        zzalh.zza(obj);
        boolean z7 = true;
        switch (zzala.zza[zzaogVarZzb.zzb().ordinal()]) {
            case 1:
                z7 = obj instanceof Integer;
                break;
            case 2:
                z7 = obj instanceof Long;
                break;
            case 3:
                z7 = obj instanceof Float;
                break;
            case 4:
                z7 = obj instanceof Double;
                break;
            case 5:
                z7 = obj instanceof Boolean;
                break;
            case 6:
                z7 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzajv) && !(obj instanceof byte[])) {
                    z7 = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof zzalk)) {
                    z7 = false;
                }
                break;
            case 9:
                if (!(obj instanceof zzamm) && !(obj instanceof zzalq)) {
                    z7 = false;
                }
                break;
            default:
                z7 = false;
                break;
        }
        if (!z7) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t7.zza()), t7.zzb().zzb(), obj.getClass().getName()));
        }
    }

    private zzakx(boolean z7) {
        this(new zzanf());
        zze();
    }

    private static <T extends zzakz<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzaoj.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (!zzb(list.get(i7))) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t7, Object obj) {
        if (t7.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj2 = list.get(i7);
                    zzc(t7, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t7, obj);
        }
        if (obj instanceof zzalq) {
            this.zzd = true;
        }
        this.zza.put(t7, obj);
    }

    public static int zza(zzakz<?> zzakzVar, Object obj) {
        zzaog zzaogVarZzb = zzakzVar.zzb();
        int iZza = zzakzVar.zza();
        if (zzakzVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i7 = 0;
            if (!zzakzVar.zzd()) {
                int iZza2 = 0;
                while (i7 < size) {
                    iZza2 += zza(zzaogVarZzb, iZza, list.get(i7));
                    i7++;
                }
                return iZza2;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int iZza3 = 0;
            while (i7 < size) {
                iZza3 += zza(zzaogVarZzb, list.get(i7));
                i7++;
            }
            return zzakn.zzh(iZza) + iZza3 + zzakn.zzi(iZza3);
        }
        return zza(zzaogVarZzb, iZza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzamo) {
            return ((zzamo) obj).zzv();
        }
        if (obj instanceof zzalq) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int iZzb = this.zza.zzb();
        int iZza = 0;
        for (int i7 = 0; i7 < iZzb; i7++) {
            iZza += zza((Map.Entry) this.zza.zza(i7));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZza += zza((Map.Entry) it.next());
        }
        return iZza;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzaoj.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzalq) {
                return zzakn.zza(entry.getKey().zza(), (zzalq) value);
            }
            return zzakn.zza(entry.getKey().zza(), (zzamm) value);
        }
        return zza((zzakz<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzamr) {
            return ((zzamr) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t7) {
        Object obj = this.zza.get(t7);
        if (obj instanceof zzalq) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    public final void zza(zzakx<T> zzakxVar) {
        int iZzb = zzakxVar.zza.zzb();
        for (int i7 = 0; i7 < iZzb; i7++) {
            zzb((Map.Entry) zzakxVar.zza.zza(i7));
        }
        Iterator it = zzakxVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    static void zza(zzakn zzaknVar, zzaog zzaogVar, int i7, Object obj) {
        if (zzaogVar == zzaog.zzj) {
            zzamm zzammVar = (zzamm) obj;
            zzalh.zza(zzammVar);
            zzaknVar.zzj(i7, 3);
            zzammVar.zza(zzaknVar);
            zzaknVar.zzj(i7, 4);
        }
        zzaknVar.zzj(i7, zzaogVar.zza());
        switch (zzala.zzb[zzaogVar.ordinal()]) {
            case 1:
                zzaknVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzaknVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzaknVar.zzh(((Long) obj).longValue());
                break;
            case 4:
                zzaknVar.zzh(((Long) obj).longValue());
                break;
            case 5:
                zzaknVar.zzk(((Integer) obj).intValue());
                break;
            case 6:
                zzaknVar.zzf(((Long) obj).longValue());
                break;
            case 7:
                zzaknVar.zzj(((Integer) obj).intValue());
                break;
            case 8:
                zzaknVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzamm) obj).zza(zzaknVar);
                break;
            case 10:
                zzaknVar.zzb((zzamm) obj);
                break;
            case 11:
                if (obj instanceof zzajv) {
                    zzaknVar.zzb((zzajv) obj);
                } else {
                    zzaknVar.zzb((String) obj);
                }
                break;
            case 12:
                if (obj instanceof zzajv) {
                    zzaknVar.zzb((zzajv) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzaknVar.zzb(bArr, 0, bArr.length);
                }
                break;
            case 13:
                zzaknVar.zzm(((Integer) obj).intValue());
                break;
            case 14:
                zzaknVar.zzj(((Integer) obj).intValue());
                break;
            case 15:
                zzaknVar.zzf(((Long) obj).longValue());
                break;
            case 16:
                zzaknVar.zzl(((Integer) obj).intValue());
                break;
            case 17:
                zzaknVar.zzg(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzalk) {
                    zzaknVar.zzk(((zzalk) obj).zza());
                } else {
                    zzaknVar.zzk(((Integer) obj).intValue());
                }
                break;
        }
    }
}
