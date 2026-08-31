package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.AbstractC3755j;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpy {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfpf zzd;
    private boolean zze;

    public zzfpy(Context context, zzaxq zzaxqVar, zzfpf zzfpfVar, boolean z7) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzaxqVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfpfVar;
        this.zze = z7;
    }

    private final File zze(String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        return "FBAMTD".concat(String.valueOf(this.zzc));
    }

    private final String zzg() {
        return "LATMTD".concat(String.valueOf(this.zzc));
    }

    private static String zzh(zzaxs zzaxsVar) {
        zzaxv zzaxvVarZzi = zzaxw.zzi();
        zzaxvVarZzi.zza(zzaxsVar.zza().zza());
        zzaxvVarZzi.zzb(zzaxsVar.zza().zzb());
        zzaxvVarZzi.zzd(zzaxsVar.zza().zzd());
        zzaxvVarZzi.zze(zzaxsVar.zza().zze());
        zzaxvVarZzi.zzc(zzaxsVar.zza().zzc());
        return AbstractC3755j.m18182a(((zzaxw) zzaxvVarZzi.zzbu()).zzaN());
    }

    private final void zzi(int i7, long j7) {
        this.zzd.zza(i7, j7);
    }

    private final void zzj(int i7, long j7, String str) {
        this.zzd.zzb(i7, j7, str);
    }

    private final zzaxw zzk(int i7) {
        String string = i7 == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrM18185d = AbstractC3755j.m18185d(string);
            zzhhb zzhhbVar = zzhhb.zzb;
            return zzaxw.zzh(zzhhb.zzr(bArrM18185d, 0, bArrM18185d.length), this.zze ? zzhhr.zza() : zzhhr.zzb());
        } catch (zzhiw unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzaxs zzaxsVar, zzfpx zzfpxVar) {
        boolean z7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzaxw zzaxwVarZzk = zzk(1);
                String strZza = zzaxsVar.zza().zza();
                if (zzaxwVarZzk != null && zzaxwVarZzk.zza().equals(strZza)) {
                    zzi(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileZze = zze(strZza);
                if (fileZze.exists()) {
                    String str = true != fileZze.isDirectory() ? "0" : "1";
                    String str2 = true != fileZze.isFile() ? "0" : "1";
                    z7 = false;
                    StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    zzj(4023, jCurrentTimeMillis2, sb.toString());
                    zzi(4015, jCurrentTimeMillis2);
                } else {
                    z7 = false;
                    if (!fileZze.mkdirs()) {
                        zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? "0" : "1"));
                        zzi(4015, jCurrentTimeMillis2);
                        return false;
                    }
                }
                File fileZze2 = zze(strZza);
                File file = new File(fileZze2, "pcam.jar");
                File file2 = new File(fileZze2, "pcbc");
                if (!zzfps.zzb(file, zzaxsVar.zzb().zzv())) {
                    zzi(4016, jCurrentTimeMillis);
                    return z7;
                }
                if (!zzfps.zzb(file2, zzaxsVar.zzc().zzv())) {
                    zzi(4017, jCurrentTimeMillis);
                    return z7;
                }
                if (zzfpxVar != null && !zzfpxVar.zza(file)) {
                    zzi(4018, jCurrentTimeMillis);
                    zzfps.zze(fileZze2);
                    return z7;
                }
                String strZzh = zzh(zzaxsVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.zzb;
                String string = sharedPreferences.getString(zzg(), null);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(zzg(), strZzh);
                if (string != null) {
                    editorEdit.putString(zzf(), string);
                }
                if (!editorEdit.commit()) {
                    zzi(4019, jCurrentTimeMillis3);
                    return z7;
                }
                HashSet hashSet = new HashSet();
                zzaxw zzaxwVarZzk2 = zzk(1);
                if (zzaxwVarZzk2 != null) {
                    hashSet.add(zzaxwVarZzk2.zza());
                }
                zzaxw zzaxwVarZzk3 = zzk(2);
                if (zzaxwVarZzk3 != null) {
                    hashSet.add(zzaxwVarZzk3.zza());
                }
                boolean z8 = z7;
                File[] fileArrListFiles = new File(this.zza.getDir("pccache", z8 ? 1 : 0), this.zzc).listFiles();
                int length = fileArrListFiles.length;
                for (int i7 = z8 ? 1 : 0; i7 < length; i7++) {
                    File file3 = fileArrListFiles[i7];
                    if (!hashSet.contains(file3.getName())) {
                        zzfps.zze(file3);
                    }
                }
                zzi(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzaxs zzaxsVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                if (!zzfps.zzb(new File(zze(zzaxsVar.zza().zza()), "pcbc"), zzaxsVar.zzc().zzv())) {
                    zzi(4020, jCurrentTimeMillis);
                    return false;
                }
                String strZzh = zzh(zzaxsVar);
                SharedPreferences.Editor editorEdit = this.zzb.edit();
                editorEdit.putString(zzg(), strZzh);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    zzi(5015, jCurrentTimeMillis);
                } else {
                    zzi(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzfpq zzc(int i7) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzaxw zzaxwVarZzk = zzk(1);
                if (zzaxwVarZzk == null) {
                    zzi(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileZze = zze(zzaxwVarZzk.zza());
                File file = new File(fileZze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileZze, "pcam");
                }
                File file2 = new File(fileZze, "pcbc");
                File file3 = new File(fileZze, "pcopt");
                zzi(5016, jCurrentTimeMillis);
                return new zzfpq(zzaxwVarZzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i7) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzaxw zzaxwVarZzk = zzk(1);
                if (zzaxwVarZzk == null) {
                    zzi(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileZze = zze(zzaxwVarZzk.zza());
                if (!new File(fileZze, "pcam.jar").exists()) {
                    zzi(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileZze, "pcbc").exists()) {
                    zzi(5019, jCurrentTimeMillis);
                    return true;
                }
                zzi(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
