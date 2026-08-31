package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzho {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhn zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z7;
        boolean z8;
        zzhn zzhnVar;
        Unsafe unsafeZzg = zzg();
        zzc = unsafeZzg;
        int i7 = zzdv.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzv = zzv(cls);
        zze = zZzv;
        Class cls2 = Integer.TYPE;
        boolean zZzv2 = zzv(cls2);
        zzhn zzhlVar = null;
        if (unsafeZzg != null) {
            if (zZzv) {
                zzhlVar = new zzhm(unsafeZzg);
            } else if (zZzv2) {
                zzhlVar = new zzhl(unsafeZzg);
            }
        }
        zzf = zzhlVar;
        if (zzhlVar == null) {
            z7 = false;
        } else {
            try {
                Class<?> cls3 = zzhlVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzB() == null) {
                    z7 = false;
                } else {
                    z7 = true;
                }
            } catch (Throwable th) {
                zzh(th);
            }
        }
        zzg = z7;
        zzhn zzhnVar2 = zzf;
        if (zzhnVar2 == null) {
            z8 = false;
        } else {
            try {
                Class<?> cls4 = zzhnVar2.zza.getClass();
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
                zzh(th2);
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
        if (fieldZzB != null && (zzhnVar = zzf) != null) {
            zzhnVar.zza.objectFieldOffset(fieldZzB);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzho() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i7 = zzdv.zza;
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

    static double zza(Object obj, long j7) {
        return zzf.zza(obj, j7);
    }

    static float zzb(Object obj, long j7) {
        return zzf.zzb(obj, j7);
    }

    static int zzc(Object obj, long j7) {
        return zzf.zza.getInt(obj, j7);
    }

    static long zzd(Object obj, long j7) {
        return zzf.zza.getLong(obj, j7);
    }

    static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    static Object zzf(Object obj, long j7) {
        return zzf.zza.getObject(obj, j7);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhk());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzho.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void zzm(Object obj, long j7, boolean z7) {
        zzf.zzc(obj, j7, z7);
    }

    static void zzn(byte[] bArr, long j7, byte b7) {
        zzf.zzd(bArr, zza + j7, b7);
    }

    static void zzo(Object obj, long j7, double d7) {
        zzf.zze(obj, j7, d7);
    }

    static void zzp(Object obj, long j7, float f7) {
        zzf.zzf(obj, j7, f7);
    }

    static void zzq(Object obj, long j7, int i7) {
        zzf.zza.putInt(obj, j7, i7);
    }

    static void zzr(Object obj, long j7, long j8) {
        zzf.zza.putLong(obj, j7, j8);
    }

    static void zzs(Object obj, long j7, Object obj2) {
        zzf.zza.putObject(obj, j7, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j7) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j7) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzv(Class cls) {
        int i7 = zzdv.zza;
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

    static boolean zzw(Object obj, long j7) {
        return zzf.zzg(obj, j7);
    }

    static boolean zzx() {
        return zzh;
    }

    static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
