package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.C3553a;
import com.google.android.recaptcha.internal.zzmx;
import com.google.android.recaptcha.internal.zznd;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zznd<MessageType extends zznd<MessageType, BuilderType>, BuilderType extends zzmx<MessageType, BuilderType>> extends zzko<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzpm zzc = zzpm.zzc();

    protected static zznj zzA() {
        return zznx.zzf();
    }

    protected static zznk zzB() {
        return zzot.zze();
    }

    protected static zznk zzC(zznk zznkVar) {
        int size = zznkVar.size();
        return zznkVar.zzd(size + size);
    }

    static Object zzE(Method method, Object obj, Object... objArr) {
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

    protected static Object zzF(zzoi zzoiVar, String str, Object[] objArr) {
        return new zzou(zzoiVar, str, objArr);
    }

    protected static void zzI(Class cls, zznd zzndVar) {
        zzndVar.zzH();
        zzb.put(cls, zzndVar);
    }

    protected static final boolean zzK(zznd zzndVar, boolean z7) {
        byte bByteValue = ((Byte) zzndVar.zzh(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzos.zza().zzb(zzndVar.getClass()).zzl(zzndVar);
        if (z7) {
            zzndVar.zzh(2, true != zZzl ? null : zzndVar, null);
        }
        return zZzl;
    }

    private final int zzf(zzow zzowVar) {
        return zzos.zza().zzb(getClass()).zza(this);
    }

    private static zznd zzg(zznd zzndVar) throws zznn {
        if (zzndVar == null || zzK(zzndVar, true)) {
            return zzndVar;
        }
        throw new zzpk(zzndVar).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zznd zzi(zznd zzndVar, byte[] bArr, int i7, int i8, zzmo zzmoVar) throws zznn {
        if (i8 == 0) {
            return zzndVar;
        }
        zznd zzndVarZzv = zzndVar.zzv();
        try {
            zzow zzowVarZzb = zzos.zza().zzb(zzndVarZzv.getClass());
            zzowVarZzb.zzi(zzndVarZzv, bArr, 0, i8, new zzkt(zzmoVar));
            zzowVarZzb.zzf(zzndVarZzv);
            return zzndVarZzv;
        } catch (zznn e7) {
            if (e7.zzb()) {
                throw new zznn(e7);
            }
            throw e7;
        } catch (zzpk e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zznn) {
                throw ((zznn) e9.getCause());
            }
            throw new zznn(e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static zznc zzs(zzoi zzoiVar, Object obj, zzoi zzoiVar2, zzng zzngVar, int i7, zzpw zzpwVar, Class cls) {
        return new zznc(zzoiVar, "", null, new zznb(null, i7, zzpwVar, false, false), cls);
    }

    static zznd zzu(Class cls) {
        Map map = zzb;
        zznd zzndVar = (zznd) map.get(cls);
        if (zzndVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzndVar = (zznd) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zzndVar != null) {
            return zzndVar;
        }
        zznd zzndVar2 = (zznd) ((zznd) zzps.zze(cls)).zzh(6, null, null);
        if (zzndVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzndVar2);
        return zzndVar2;
    }

    protected static zznd zzw(zznd zzndVar, InputStream inputStream) throws zznn {
        zzli zzlgVar;
        int i7 = zzli.zzd;
        if (inputStream == null) {
            byte[] bArr = zznl.zzb;
            int length = bArr.length;
            zzlgVar = zzli.zzH(bArr, 0, 0, false);
        } else {
            zzlgVar = new zzlg(inputStream, 4096, null);
        }
        int i8 = zzmo.zzb;
        int i9 = zzos.zza;
        zzmo zzmoVar = zzmo.zza;
        zznd zzndVarZzv = zzndVar.zzv();
        try {
            zzow zzowVarZzb = zzos.zza().zzb(zzndVarZzv.getClass());
            zzowVarZzb.zzh(zzndVarZzv, zzlj.zzq(zzlgVar), zzmoVar);
            zzowVarZzb.zzf(zzndVarZzv);
            zzg(zzndVarZzv);
            return zzndVarZzv;
        } catch (zznn e7) {
            if (e7.zzb()) {
                throw new zznn(e7);
            }
            throw e7;
        } catch (zzpk e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zznn) {
                throw ((zznn) e9.getCause());
            }
            throw new zznn(e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof zznn) {
                throw ((zznn) e10.getCause());
            }
            throw e10;
        }
    }

    protected static zznd zzx(zznd zzndVar, byte[] bArr) throws zznn {
        int i7 = zzmo.zzb;
        int i8 = zzos.zza;
        zznd zzndVarZzi = zzi(zzndVar, bArr, 0, bArr.length, zzmo.zza);
        zzg(zzndVarZzi);
        return zzndVarZzi;
    }

    protected static zzni zzy() {
        return zzne.zzf();
    }

    protected static zzni zzz(zzni zzniVar) {
        int size = zzniVar.size();
        return zzniVar.zzd(size + size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzos.zza().zzb(getClass()).zzk(this, (zznd) obj);
    }

    public final int hashCode() {
        if (zzL()) {
            return zzn();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int iZzn = zzn();
        this.zza = iZzn;
        return iZzn;
    }

    public final String toString() {
        return zzok.zza(this, super.toString());
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final zzoq zzD() {
        return (zzoq) zzh(7, null, null);
    }

    protected final void zzG() {
        zzos.zza().zzb(getClass()).zzf(this);
        zzH();
    }

    final void zzH() {
        this.zzd &= C3553a.e.API_PRIORITY_OTHER;
    }

    final void zzJ(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | C3553a.e.API_PRIORITY_OTHER;
    }

    final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzko
    final int zza(zzow zzowVar) {
        if (zzL()) {
            int iZza = zzowVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i7 = this.zzd & C3553a.e.API_PRIORITY_OTHER;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int iZza2 = zzowVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final /* synthetic */ zzoh zzad() {
        return (zzmx) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final /* synthetic */ zzoh zzae() {
        zzmx zzmxVar = (zzmx) zzh(5, null, null);
        zzmxVar.zzh(this);
        return zzmxVar;
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final void zze(zzln zzlnVar) {
        zzos.zza().zzb(getClass()).zzj(this, zzlo.zza(zzlnVar));
    }

    protected abstract Object zzh(int i7, Object obj, Object obj2);

    @Override // com.google.android.recaptcha.internal.zzoj
    public final /* synthetic */ zzoi zzm() {
        return (zznd) zzh(6, null, null);
    }

    final int zzn() {
        return zzos.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final int zzo() {
        if (zzL()) {
            int iZzf = zzf(null);
            if (iZzf >= 0) {
                return iZzf;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZzf);
        }
        int i7 = this.zzd & C3553a.e.API_PRIORITY_OTHER;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int iZzf2 = zzf(null);
        if (iZzf2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzf2;
            return iZzf2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZzf2);
    }

    @Override // com.google.android.recaptcha.internal.zzoj
    public final boolean zzp() {
        return zzK(this, true);
    }

    protected final zzmx zzq() {
        return (zzmx) zzh(5, null, null);
    }

    public final zzmx zzr() {
        zzmx zzmxVar = (zzmx) zzh(5, null, null);
        zzmxVar.zzh(this);
        return zzmxVar;
    }

    final zznd zzv() {
        return (zznd) zzh(4, null, null);
    }
}
