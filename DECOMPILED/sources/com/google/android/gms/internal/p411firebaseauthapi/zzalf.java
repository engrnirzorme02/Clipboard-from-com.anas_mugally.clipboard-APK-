package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.firebase-auth-api.zzalf.zzb;
import com.google.android.gms.internal.p411firebaseauthapi.zzalf;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzalf<MessageType extends zzalf<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzajm<MessageType, BuilderType> {
    private static Map<Class<?>, zzalf<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzanx zzb = zzanx.zzc();

    protected static class zza<T extends zzalf<T, ?>> extends zzajq<T> {
        public zza(T t7) {
        }
    }

    static final class zzc implements zzakz<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakz
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakz
        public final zzaog zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakz
        public final zzaoj zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakz
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakz
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakz
        public final zzaml zza(zzaml zzamlVar, zzamm zzammVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakz
        public final zzamr zza(zzamr zzamrVar, zzamr zzamrVar2) {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzalf<MessageType, BuilderType> implements zzamo {
        protected zzakx<zzc> zzc = zzakx.zzb();

        final zzakx<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzakx) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static final enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    public static class zzf<ContainingType extends zzamm, Type> extends zzakr<ContainingType, Type> {
    }

    static /* synthetic */ boolean zza(zzalf zzalfVar, boolean z7) {
        return zzb(zzalfVar, false);
    }

    private final int zzb(zzanb<?> zzanbVar) {
        return zzanbVar == null ? zzamx.zza().zza(this).zza(this) : zzanbVar.zza(this);
    }

    protected static <E> zzalm<E> zzp() {
        return zzana.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzamx.zza().zza(this).zzb(this, (zzalf) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzw()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzamn.zza(this, super.toString());
    }

    protected abstract Object zza(int i7, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajm
    final int zzi() {
        return this.zzd & C3553a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamm
    public final int zzl() {
        return zza((zzanb) null);
    }

    protected final <MessageType2 extends zzalf<MessageType2, BuilderType2>, BuilderType2 extends zzb<MessageType2, BuilderType2>> BuilderType2 zzm() {
        return (BuilderType2) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    final MessageType zzo() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamm
    public final /* synthetic */ zzaml zzq() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamm
    public final /* synthetic */ zzaml zzr() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamo
    public final /* synthetic */ zzamm zzs() {
        return (zzalf) zza(zze.zzf, (Object) null, (Object) null);
    }

    protected final void zzt() {
        zzamx.zza().zza(this).zzd(this);
        zzu();
    }

    final void zzu() {
        this.zzd &= C3553a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamo
    public final boolean zzv() {
        return zzb(this, true);
    }

    final boolean zzw() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    private final int zza() {
        return zzamx.zza().zza(this).zzb(this);
    }

    private static <T extends zzalf<T, ?>> T zzb(T t7, zzajv zzajvVar, zzaku zzakuVar) {
        zzakh zzakhVarZzc = zzajvVar.zzc();
        T t8 = (T) zza(t7, zzakhVarZzc, zzakuVar);
        zzakhVarZzc.zzc(0);
        return t8;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajm
    final int zza(zzanb zzanbVar) {
        if (zzw()) {
            int iZzb = zzb((zzanb<?>) zzanbVar);
            if (iZzb >= 0) {
                return iZzb;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZzb);
        }
        if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        }
        int iZzb2 = zzb((zzanb<?>) zzanbVar);
        zzb(iZzb2);
        return iZzb2;
    }

    public static abstract class zzb<MessageType extends zzalf<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzajo<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        protected zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzw()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzo();
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajo
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzf();
            return zzbVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzw()) {
                zzh();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajo
        /* JADX INFO: renamed from: zzb */
        public final /* synthetic */ zzajo clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaml
        /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final MessageType zze() {
            MessageType messagetype = (MessageType) zzf();
            if (messagetype.zzv()) {
                return messagetype;
            }
            throw new zzanv(messagetype);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaml
        /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public MessageType zzf() {
            if (!this.zza.zzw()) {
                return this.zza;
            }
            this.zza.zzt();
            return this.zza;
        }

        protected final void zzg() {
            if (this.zza.zzw()) {
                return;
            }
            zzh();
        }

        protected void zzh() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamo
        public final /* synthetic */ zzamm zzs() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamo
        public final boolean zzv() {
            return zzalf.zza((zzalf) this.zza, false);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzamx.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajm
    final void zzb(int i7) {
        if (i7 >= 0) {
            this.zzd = (i7 & C3553a.e.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i7);
        }
    }

    private static final <T extends zzalf<T, ?>> boolean zzb(T t7, boolean z7) {
        byte bByteValue = ((Byte) t7.zza(zze.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZze = zzamx.zza().zza(t7).zze(t7);
        if (z7) {
            t7.zza(zze.zzb, zZze ? t7 : null, null);
        }
        return zZze;
    }

    private static <T extends zzalf<T, ?>> T zza(T t7) throws zzall {
        if (t7 == null || zzb(t7, true)) {
            return t7;
        }
        zzall zzallVarZza = new zzanv(t7).zza();
        zzallVarZza.getClass();
        throw zzallVarZza;
    }

    static <T extends zzalf<?, ?>> T zza(Class<T> cls) {
        T t7 = (T) zzc.get(cls);
        if (t7 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t7 = (T) zzc.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (t7 != null) {
            return t7;
        }
        T t8 = (T) ((zzalf) zzanz.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
        if (t8 != null) {
            zzc.put((Class<?>) cls, t8);
            return t8;
        }
        throw new IllegalStateException();
    }

    protected static <T extends zzalf<T, ?>> T zza(T t7, zzajv zzajvVar, zzaku zzakuVar) {
        return (T) zza(zzb(t7, zzajvVar, zzakuVar));
    }

    protected static <T extends zzalf<T, ?>> T zza(T t7, InputStream inputStream, zzaku zzakuVar) {
        zzakh zzakjVar;
        if (inputStream == null) {
            byte[] bArr = zzalh.zzb;
            zzakjVar = zzakh.zza(bArr, 0, bArr.length, false);
        } else {
            zzakjVar = new zzakj(inputStream);
        }
        return (T) zza(zza(t7, zzakjVar, zzakuVar));
    }

    protected static <T extends zzalf<T, ?>> T zza(T t7, byte[] bArr, zzaku zzakuVar) {
        return (T) zza(zza(t7, bArr, 0, bArr.length, zzakuVar));
    }

    private static <T extends zzalf<T, ?>> T zza(T t7, zzakh zzakhVar, zzaku zzakuVar) throws zzall {
        T t8 = (T) t7.zzo();
        try {
            zzanb zzanbVarZza = zzamx.zza().zza(t8);
            zzanbVarZza.zza(t8, zzakl.zza(zzakhVar), zzakuVar);
            zzanbVarZza.zzd(t8);
            return t8;
        } catch (zzall e7) {
            if (e7.zzl()) {
                throw new zzall(e7);
            }
            throw e7;
        } catch (zzanv e8) {
            zzall zzallVarZza = e8.zza();
            zzallVarZza.getClass();
            throw zzallVarZza;
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzall) {
                throw ((zzall) e9.getCause());
            }
            throw new zzall(e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof zzall) {
                throw ((zzall) e10.getCause());
            }
            throw e10;
        }
    }

    private static <T extends zzalf<T, ?>> T zza(T t7, byte[] bArr, int i7, int i8, zzaku zzakuVar) throws zzall {
        if (i8 == 0) {
            return t7;
        }
        T t8 = (T) t7.zzo();
        try {
            zzanb zzanbVarZza = zzamx.zza().zza(t8);
            zzanbVarZza.zza(t8, bArr, 0, i8, new zzaju(zzakuVar));
            zzanbVarZza.zzd(t8);
            return t8;
        } catch (zzall e7) {
            if (e7.zzl()) {
                throw new zzall(e7);
            }
            throw e7;
        } catch (zzanv e8) {
            zzall zzallVarZza = e8.zza();
            zzallVarZza.getClass();
            throw zzallVarZza;
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzall) {
                throw ((zzall) e9.getCause());
            }
            throw new zzall(e9);
        } catch (IndexOutOfBoundsException unused) {
            zzall zzallVarZzj = zzall.zzj();
            zzallVarZzj.getClass();
            throw zzallVarZzj;
        }
    }

    protected static <E> zzalm<E> zza(zzalm<E> zzalmVar) {
        return zzalmVar.zza(zzalmVar.size() << 1);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    protected static Object zza(zzamm zzammVar, String str, Object[] objArr) {
        return new zzamz(zzammVar, str, objArr);
    }

    protected static <T extends zzalf<?, ?>> void zza(Class<T> cls, T t7) {
        t7.zzu();
        zzc.put(cls, t7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamm
    public final void zza(zzakn zzaknVar) {
        zzamx.zza().zza(this).zza(this, zzakp.zza(zzaknVar));
    }
}
