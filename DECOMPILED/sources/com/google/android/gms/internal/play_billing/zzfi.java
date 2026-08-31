package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzfi;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfi<MessageType extends zzfi<MessageType, BuilderType>, BuilderType extends zzfe<MessageType, BuilderType>> extends zzds<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzhi zzc = zzhi.zzc();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzA(zzfi zzfiVar, boolean z7) {
        byte bByteValue = ((Byte) zzfiVar.zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzgs.zza().zzb(zzfiVar.getClass()).zzk(zzfiVar);
        if (z7) {
            zzfiVar.zzb(2, true != zZzk ? null : zzfiVar, null);
        }
        return zZzk;
    }

    private final int zzc(zzgv zzgvVar) {
        return zzgs.zza().zzb(getClass()).zza(this);
    }

    private static zzfi zzd(zzfi zzfiVar, byte[] bArr, int i7, int i8, zzeu zzeuVar) throws zzfq {
        if (i8 == 0) {
            return zzfiVar;
        }
        zzfi zzfiVarZzo = zzfiVar.zzo();
        try {
            zzgv zzgvVarZzb = zzgs.zza().zzb(zzfiVarZzo.getClass());
            zzgvVarZzb.zzh(zzfiVarZzo, bArr, 0, i8, new zzdw(zzeuVar));
            zzgvVarZzb.zzf(zzfiVarZzo);
            return zzfiVarZzo;
        } catch (zzfq e7) {
            throw e7;
        } catch (zzhg e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzfq) {
                throw ((zzfq) e9.getCause());
            }
            throw new zzfq(e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    static zzfi zzn(Class cls) {
        Map map = zzb;
        zzfi zzfiVar = (zzfi) map.get(cls);
        if (zzfiVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfiVar = (zzfi) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zzfiVar != null) {
            return zzfiVar;
        }
        zzfi zzfiVar2 = (zzfi) ((zzfi) zzho.zze(cls)).zzb(6, null, null);
        if (zzfiVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzfiVar2);
        return zzfiVar2;
    }

    protected static zzfi zzp(zzfi zzfiVar, byte[] bArr, zzeu zzeuVar) throws zzfq {
        zzfi zzfiVarZzd = zzd(zzfiVar, bArr, 0, bArr.length, zzeuVar);
        if (zzfiVarZzd == null || zzA(zzfiVarZzd, true)) {
            return zzfiVarZzd;
        }
        throw new zzhg(zzfiVarZzd).zza();
    }

    protected static zzfm zzq() {
        return zzfj.zzf();
    }

    protected static zzfn zzr() {
        return zzgt.zze();
    }

    static Object zzs(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzt(zzgl zzglVar, String str, Object[] objArr) {
        return new zzgu(zzglVar, str, objArr);
    }

    protected static void zzw(Class cls, zzfi zzfiVar) {
        zzfiVar.zzv();
        zzb.put(cls, zzfiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgs.zza().zzb(getClass()).zzj(this, (zzfi) obj);
    }

    public final int hashCode() {
        if (zzz()) {
            return zzi();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int iZzi = zzi();
        this.zza = iZzi;
        return iZzi;
    }

    public final String toString() {
        return zzgn.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final /* synthetic */ zzgk zzK() {
        return (zzfe) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final void zzL(zzep zzepVar) {
        zzgs.zza().zzb(getClass()).zzi(this, zzeq.zza(zzepVar));
    }

    protected abstract Object zzb(int i7, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.play_billing.zzds
    final int zze(zzgv zzgvVar) {
        if (zzz()) {
            int iZza = zzgvVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i7 = this.zzd & C3553a.e.API_PRIORITY_OTHER;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int iZza2 = zzgvVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final /* synthetic */ zzgl zzh() {
        return (zzfi) zzb(6, null, null);
    }

    final int zzi() {
        return zzgs.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final int zzj() {
        if (zzz()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZzc);
        }
        int i7 = this.zzd & C3553a.e.API_PRIORITY_OTHER;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzc2;
            return iZzc2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZzc2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final boolean zzk() {
        return zzA(this, true);
    }

    protected final zzfe zzl() {
        return (zzfe) zzb(5, null, null);
    }

    public final zzfe zzm() {
        zzfe zzfeVar = (zzfe) zzb(5, null, null);
        zzfeVar.zzd(this);
        return zzfeVar;
    }

    final zzfi zzo() {
        return (zzfi) zzb(4, null, null);
    }

    protected final void zzu() {
        zzgs.zza().zzb(getClass()).zzf(this);
        zzv();
    }

    final void zzv() {
        this.zzd &= C3553a.e.API_PRIORITY_OTHER;
    }

    final void zzx(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | C3553a.e.API_PRIORITY_OTHER;
    }

    final boolean zzz() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
