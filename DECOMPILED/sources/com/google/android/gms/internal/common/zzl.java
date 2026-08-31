package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl {
    public static Object zza(Class cls, String str, zzj... zzjVarArr) {
        return zzc(cls, "isIsolated", null, false, zzjVarArr);
    }

    public static Object zzb(String str, String str2, ClassLoader classLoader, zzj... zzjVarArr) {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zzjVarArr);
    }

    private static Object zzc(Class cls, String str, Object obj, boolean z7, zzj... zzjVarArr) {
        int length = zzjVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i7 = 0; i7 < zzjVarArr.length; i7++) {
            zzj zzjVar = zzjVarArr[i7];
            zzjVar.getClass();
            clsArr[i7] = zzjVar.zzc();
            objArr[i7] = zzjVarArr[i7].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
