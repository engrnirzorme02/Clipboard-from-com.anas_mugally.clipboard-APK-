package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzop {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzoo zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z7;
        boolean z8;
        zzoo zzooVar;
        Unsafe unsafeZzq = zzq();
        zzc = unsafeZzq;
        int i7 = zzkv.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzr = zzr(cls);
        zze = zZzr;
        Class cls2 = Integer.TYPE;
        boolean zZzr2 = zzr(cls2);
        zzoo zzomVar = null;
        if (unsafeZzq != null) {
            if (zZzr) {
                zzomVar = new zzon(unsafeZzq);
            } else if (zZzr2) {
                zzomVar = new zzom(unsafeZzq);
            }
        }
        zzf = zzomVar;
        if (zzomVar == null) {
            z7 = false;
        } else {
            try {
                Class<?> cls3 = zzomVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzB() == null) {
                    z7 = false;
                } else {
                    z7 = true;
                }
            } catch (Throwable th) {
                zzy(th);
            }
        }
        zzg = z7;
        zzoo zzooVar2 = zzf;
        if (zzooVar2 == null) {
            z8 = false;
        } else {
            try {
                Class<?> cls4 = zzooVar2.zza.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z8 = true;
            } catch (Throwable th2) {
                zzy(th2);
                z8 = false;
            }
        }
        zzh = z8;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        Field fieldZzB = zzB();
        if (fieldZzB != null && (zzooVar = zzf) != null) {
            zzooVar.zza.objectFieldOffset(fieldZzB);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzop() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i7 = zzkv.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, "address");
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j7, byte b7) {
        Unsafe unsafe = zzf.zza;
        long j8 = (-4) & j7;
        int i7 = unsafe.getInt(obj, j8);
        int i8 = ((~((int) j7)) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b7) << i8) | (i7 & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j7, byte b7) {
        Unsafe unsafe = zzf.zza;
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b7) << i7) | (unsafe.getInt(obj, j8) & (~(255 << i7))));
    }

    static boolean zza() {
        return zzh;
    }

    static boolean zzb() {
        return zzg;
    }

    static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    static int zzd(Object obj, long j7) {
        return zzf.zza.getInt(obj, j7);
    }

    static void zze(Object obj, long j7, int i7) {
        zzf.zza.putInt(obj, j7, i7);
    }

    static long zzf(Object obj, long j7) {
        return zzf.zza.getLong(obj, j7);
    }

    static void zzg(Object obj, long j7, long j8) {
        zzf.zza.putLong(obj, j7, j8);
    }

    static boolean zzh(Object obj, long j7) {
        return zzf.zzb(obj, j7);
    }

    static void zzi(Object obj, long j7, boolean z7) {
        zzf.zzc(obj, j7, z7);
    }

    static float zzj(Object obj, long j7) {
        return zzf.zzd(obj, j7);
    }

    static void zzk(Object obj, long j7, float f7) {
        zzf.zze(obj, j7, f7);
    }

    static double zzl(Object obj, long j7) {
        return zzf.zzf(obj, j7);
    }

    static void zzm(Object obj, long j7, double d7) {
        zzf.zzg(obj, j7, d7);
    }

    static Object zzn(Object obj, long j7) {
        return zzf.zza.getObject(obj, j7);
    }

    static void zzo(Object obj, long j7, Object obj2) {
        zzf.zza.putObject(obj, j7, obj2);
    }

    static void zzp(byte[] bArr, long j7, byte b7) {
        zzf.zza(bArr, zza + j7, b7);
    }

    static Unsafe zzq() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzol());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzr(Class cls) {
        int i7 = zzkv.zza;
        try {
            Class cls2 = zzd;
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

    static /* synthetic */ boolean zzu(Object obj, long j7) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzv(Object obj, long j7) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void zzy(Throwable th) {
        Logger.getLogger(zzop.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
