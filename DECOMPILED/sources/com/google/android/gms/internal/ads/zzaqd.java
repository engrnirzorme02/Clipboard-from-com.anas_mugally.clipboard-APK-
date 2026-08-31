package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqd implements zzaor {
    private final zzaqc zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqd(zzaqc zzaqcVar, int i7) {
        this.zzc = zzaqcVar;
    }

    static byte[] zzg(zzaqb zzaqbVar, long j7) throws IOException {
        long jZza = zzaqbVar.zza();
        if (j7 >= 0 && j7 <= jZza) {
            int i7 = (int) j7;
            if (i7 == j7) {
                byte[] bArr = new byte[i7];
                new DataInputStream(zzaqbVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 33 + String.valueOf(jZza).length());
        sb.append("streamToBytes length=");
        sb.append(j7);
        sb.append(", maxLength=");
        sb.append(jZza);
        throw new IOException(sb.toString());
    }

    static void zzh(OutputStream outputStream, int i7) throws IOException {
        outputStream.write(i7 & 255);
        outputStream.write((i7 >> 8) & 255);
        outputStream.write((i7 >> 16) & 255);
        outputStream.write((i7 >> 24) & 255);
    }

    static int zzi(InputStream inputStream) {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    static void zzj(OutputStream outputStream, long j7) throws IOException {
        outputStream.write((byte) j7);
        outputStream.write((byte) (j7 >>> 8));
        outputStream.write((byte) (j7 >>> 16));
        outputStream.write((byte) (j7 >>> 24));
        outputStream.write((byte) (j7 >>> 32));
        outputStream.write((byte) (j7 >>> 40));
        outputStream.write((byte) (j7 >>> 48));
        outputStream.write((byte) (j7 >>> 56));
    }

    static long zzk(InputStream inputStream) {
        return (((long) zzp(inputStream)) & 255) | ((((long) zzp(inputStream)) & 255) << 8) | ((((long) zzp(inputStream)) & 255) << 16) | ((((long) zzp(inputStream)) & 255) << 24) | ((((long) zzp(inputStream)) & 255) << 32) | ((((long) zzp(inputStream)) & 255) << 40) | ((((long) zzp(inputStream)) & 255) << 48) | ((((long) zzp(inputStream)) & 255) << 56);
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static String zzm(zzaqb zzaqbVar) {
        return new String(zzg(zzaqbVar, zzk(zzaqbVar)), "UTF-8");
    }

    private final void zzn(String str, zzaqa zzaqaVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb += zzaqaVar.zza - ((zzaqa) map.get(str)).zza;
        } else {
            this.zzb += zzaqaVar.zza;
        }
        map.put(str, zzaqaVar);
    }

    private final void zzo(String str) {
        zzaqa zzaqaVar = (zzaqa) this.zza.remove(str);
        if (zzaqaVar != null) {
            this.zzb -= zzaqaVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i7 = inputStream.read();
        if (i7 != -1) {
            return i7;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized zzaoq zza(String str) {
        zzaqa zzaqaVar = (zzaqa) this.zza.get(str);
        if (zzaqaVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzaqb zzaqbVar = new zzaqb(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                String str2 = zzaqa.zza(zzaqbVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzapt.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    zzaqbVar.close();
                    return null;
                }
                byte[] bArrZzg = zzg(zzaqbVar, zzaqbVar.zza());
                zzaoq zzaoqVar = new zzaoq();
                zzaoqVar.zza = bArrZzg;
                zzaoqVar.zzb = zzaqaVar.zzc;
                zzaoqVar.zzc = zzaqaVar.zzd;
                zzaoqVar.zzd = zzaqaVar.zze;
                zzaoqVar.zze = zzaqaVar.zzf;
                zzaoqVar.zzf = zzaqaVar.zzg;
                List<zzaoz> list = zzaqaVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaoz zzaozVar : list) {
                    treeMap.put(zzaozVar.zza(), zzaozVar.zzb());
                }
                zzaoqVar.zzg = treeMap;
                zzaoqVar.zzh = Collections.unmodifiableList(list);
                zzaqbVar.close();
                return zzaoqVar;
            } catch (Throwable th) {
                zzaqbVar.close();
                throw th;
            }
        } catch (IOException e7) {
            zzapt.zzb("%s: %s", fileZzf.getAbsolutePath(), e7.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized void zzb(String str, zzaoq zzaoqVar) {
        try {
            long j7 = this.zzb;
            int length = zzaoqVar.zza.length;
            long j8 = j7 + ((long) length);
            int i7 = this.zzd;
            float f7 = 0.9f;
            if (j8 <= i7 || length <= i7 * 0.9f) {
                File fileZzf = zzf(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzf));
                    zzaqa zzaqaVar = new zzaqa(str, zzaoqVar);
                    try {
                        zzh(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaqaVar.zzb);
                        String str2 = zzaqaVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzj(bufferedOutputStream, zzaqaVar.zzd);
                        zzj(bufferedOutputStream, zzaqaVar.zze);
                        zzj(bufferedOutputStream, zzaqaVar.zzf);
                        zzj(bufferedOutputStream, zzaqaVar.zzg);
                        List<zzaoz> list = zzaqaVar.zzh;
                        if (list != null) {
                            zzh(bufferedOutputStream, list.size());
                            for (zzaoz zzaozVar : list) {
                                zzl(bufferedOutputStream, zzaozVar.zza());
                                zzl(bufferedOutputStream, zzaozVar.zzb());
                            }
                        } else {
                            zzh(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzaoqVar.zza);
                        bufferedOutputStream.close();
                        zzaqaVar.zza = fileZzf.length();
                        zzn(str, zzaqaVar);
                        long j9 = this.zzb;
                        int i8 = this.zzd;
                        if (j9 >= i8) {
                            boolean z7 = zzapt.zzb;
                            if (z7) {
                                zzapt.zza("Pruning old cache entries.", new Object[0]);
                            }
                            long j10 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i9 = 0;
                            while (it.hasNext()) {
                                zzaqa zzaqaVar2 = (zzaqa) ((Map.Entry) it.next()).getValue();
                                String str3 = zzaqaVar2.zzb;
                                if (zzf(str3).delete()) {
                                    this.zzb -= zzaqaVar2.zza;
                                } else {
                                    zzapt.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i9++;
                                if (this.zzb < i8 * f7) {
                                    break;
                                } else {
                                    f7 = f7;
                                }
                            }
                            if (z7) {
                                zzapt.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i9), Long.valueOf(this.zzb - j10), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e7) {
                        zzapt.zzb("%s", e7.toString());
                        bufferedOutputStream.close();
                        zzapt.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzf.delete()) {
                        zzapt.zzb("Could not clean up file %s", fileZzf.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzapt.zzb("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzc();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized void zzc() {
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzaqb zzaqbVar = new zzaqb(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzaqa zzaqaVarZza = zzaqa.zza(zzaqbVar);
                            zzaqaVarZza.zza = length;
                            zzn(zzaqaVarZza.zzb, zzaqaVarZza);
                            zzaqbVar.close();
                        } catch (Throwable th) {
                            zzaqbVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzapt.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized void zzd(String str, boolean z7) {
        zzaoq zzaoqVarZza = zza(str);
        if (zzaoqVarZza != null) {
            zzaoqVarZza.zzf = 0L;
            zzaoqVarZza.zze = 0L;
            zzb(str, zzaoqVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzapt.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzaqd(File file, int i7) {
        this.zzc = new zzapz(this, file);
    }
}
