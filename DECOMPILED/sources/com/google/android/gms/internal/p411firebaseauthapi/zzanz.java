package com.google.android.gms.internal.p411firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzanz {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    private static final class zza extends zzc {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final double zza(Object obj, long j7) {
            return Double.longBitsToDouble(zze(obj, j7));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final float zzb(Object obj, long j7) {
            return Float.intBitsToFloat(zzd(obj, j7));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final boolean zzc(Object obj, long j7) {
            return zzanz.zza ? zzanz.zzf(obj, j7) : zzanz.zzg(obj, j7);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j7, boolean z7) {
            if (zzanz.zza) {
                zzanz.zza(obj, j7, z7);
            } else {
                zzanz.zzb(obj, j7, z7);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j7, byte b7) {
            if (!zzanz.zza) {
                zzanz.zzd(obj, j7, b7);
            } else {
                zzanz.zzc(obj, j7, b7);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j7, double d7) {
            zza(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j7, float f7) {
            zza(obj, j7, Float.floatToIntBits(f7));
        }
    }

    private static final class zzb extends zzc {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final double zza(Object obj, long j7) {
            return Double.longBitsToDouble(zze(obj, j7));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final float zzb(Object obj, long j7) {
            return Float.intBitsToFloat(zzd(obj, j7));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final boolean zzc(Object obj, long j7) {
            return zzanz.zza ? zzanz.zzf(obj, j7) : zzanz.zzg(obj, j7);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j7, boolean z7) {
            if (zzanz.zza) {
                zzanz.zza(obj, j7, z7);
            } else {
                zzanz.zzb(obj, j7, z7);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j7, byte b7) {
            if (!zzanz.zza) {
                zzanz.zzd(obj, j7, b7);
            } else {
                zzanz.zzc(obj, j7, b7);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j7, double d7) {
            zza(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j7, float f7) {
            zza(obj, j7, Float.floatToIntBits(f7));
        }
    }

    private static abstract class zzc {
        Unsafe zza;

        zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j7);

        public abstract void zza(Object obj, long j7, byte b7);

        public abstract void zza(Object obj, long j7, double d7);

        public abstract void zza(Object obj, long j7, float f7);

        public final void zza(Object obj, long j7, int i7) {
            this.zza.putInt(obj, j7, i7);
        }

        public abstract void zza(Object obj, long j7, boolean z7);

        public abstract float zzb(Object obj, long j7);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzanz.zze() != null;
            } catch (Throwable th) {
                zzanz.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j7);

        public final int zzd(Object obj, long j7) {
            return this.zza.getInt(obj, j7);
        }

        public final long zze(Object obj, long j7) {
            return this.zza.getLong(obj, j7);
        }

        public final void zza(Object obj, long j7, long j8) {
            this.zza.putLong(obj, j7, j8);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzanz.zza(th);
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    static {
        zzc zzbVar;
        Unsafe unsafeZzb = zzb();
        zzb = unsafeZzb;
        zzc = zzajs.zza();
        boolean zZzd = zzd(Long.TYPE);
        zzd = zZzd;
        boolean zZzd2 = zzd(Integer.TYPE);
        zze = zZzd2;
        if (unsafeZzb == null) {
            zzbVar = null;
        } else if (zZzd) {
            zzbVar = new zza(unsafeZzb);
        } else if (zZzd2) {
            zzbVar = new zzb(unsafeZzb);
        } else {
            zzbVar = null;
        }
        zzf = zzbVar;
        zzg = zzbVar == null ? false : zzbVar.zzb();
        zzh = zzbVar == null ? false : zzbVar.zza();
        zzi = zzb(byte[].class);
        zzb(boolean[].class);
        zzc(boolean[].class);
        zzb(int[].class);
        zzc(int[].class);
        zzb(long[].class);
        zzc(long[].class);
        zzb(float[].class);
        zzc(float[].class);
        zzb(double[].class);
        zzc(double[].class);
        zzb(Object[].class);
        zzc(Object[].class);
        Field fieldZze = zze();
        if (fieldZze != null && zzbVar != null) {
            zzbVar.zza.objectFieldOffset(fieldZze);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzanz() {
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static long zzd(Object obj, long j7) {
        return zzf.zze(obj, j7);
    }

    static Object zze(Object obj, long j7) {
        return zzf.zza.getObject(obj, j7);
    }

    static /* synthetic */ boolean zzf(Object obj, long j7) {
        return ((byte) (zzc(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean zzg(Object obj, long j7) {
        return ((byte) (zzc(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3)))) != 0;
    }

    static boolean zzh(Object obj, long j7) {
        return zzf.zzc(obj, j7);
    }

    static float zzb(Object obj, long j7) {
        return zzf.zzb(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        zza(obj, j8, ((255 & b7) << i7) | (zzc(obj, j8) & (~(255 << i7))));
    }

    static double zza(Object obj, long j7) {
        return zzf.zza(obj, j7);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int zzc(Object obj, long j7) {
        return zzf.zzd(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, "address");
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    static void zzc(Object obj, long j7, boolean z7) {
        zzf.zza(obj, j7, z7);
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzany());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int iZzc = zzc(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        zza(obj, j8, ((255 & b7) << i7) | (iZzc & (~(255 << i7))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzanz.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static /* synthetic */ void zzb(Object obj, long j7, boolean z7) {
        zzd(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    static boolean zzc() {
        return zzh;
    }

    static /* synthetic */ void zza(Object obj, long j7, boolean z7) {
        zzc(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    static void zza(byte[] bArr, long j7, byte b7) {
        zzf.zza((Object) bArr, zzi + j7, b7);
    }

    static void zza(Object obj, long j7, double d7) {
        zzf.zza(obj, j7, d7);
    }

    static void zza(Object obj, long j7, float f7) {
        zzf.zza(obj, j7, f7);
    }

    static void zza(Object obj, long j7, int i7) {
        zzf.zza(obj, j7, i7);
    }

    static boolean zzd() {
        return zzg;
    }

    static void zza(Object obj, long j7, long j8) {
        zzf.zza(obj, j7, j8);
    }

    static void zza(Object obj, long j7, Object obj2) {
        zzf.zza.putObject(obj, j7, obj2);
    }
}
