package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.C2400k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import p122P3.AbstractC1206j;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjz {
    private static volatile AbstractC1206j zza;

    private zzjz() {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:76:0x017f, B:15:0x0025, B:17:0x002d, B:21:0x003c, B:23:0x0042, B:25:0x0048, B:27:0x0050, B:75:0x017c, B:77:0x0182, B:78:0x0185, B:79:0x0186, B:28:0x0054, B:30:0x0058, B:31:0x0065, B:33:0x006b, B:39:0x0084, B:41:0x008a, B:42:0x0096, B:62:0x015f, B:63:0x0162, B:71:0x0171, B:70:0x016e, B:72:0x0172, B:73:0x0177, B:74:0x0178, B:36:0x0073, B:38:0x0079), top: B:88:0x0007, inners: #0 }] */
    public static AbstractC1206j zza(Context context) {
        AbstractC1206j abstractC1206jM5284a;
        AbstractC1206j abstractC1206jM5284a2;
        AbstractC1206j abstractC1206j = zza;
        if (abstractC1206j != null) {
            return abstractC1206j;
        }
        synchronized (zzjz.class) {
            try {
                abstractC1206jM5284a = zza;
                if (abstractC1206jM5284a == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i7 = zzkb.zza;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        abstractC1206jM5284a = AbstractC1206j.m5284a();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = (!zzjm.zza() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c7 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                abstractC1206jM5284a2 = file.exists() ? AbstractC1206j.m5285d(file) : AbstractC1206j.m5284a();
                            } catch (RuntimeException e7) {
                                Log.e("HermeticFileOverrides", "no data dir", e7);
                                abstractC1206jM5284a2 = AbstractC1206j.m5284a();
                            }
                            if (abstractC1206jM5284a2.mo5254c()) {
                                File file2 = (File) abstractC1206jM5284a2.mo5253b();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        C2400k c2400k = new C2400k();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c7]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                C2400k c2400k2 = (C2400k) c2400k.get(str3);
                                                if (c2400k2 == null) {
                                                    c2400k2 = new C2400k();
                                                    c2400k.put(str3, c2400k2);
                                                }
                                                c2400k2.put(strDecode, strDecode2);
                                                c7 = 0;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        zzjt zzjtVar = new zzjt(c2400k);
                                        bufferedReader.close();
                                        abstractC1206jM5284a = AbstractC1206j.m5285d(zzjtVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e8) {
                                    throw new RuntimeException(e8);
                                }
                            } else {
                                abstractC1206jM5284a = AbstractC1206j.m5284a();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        abstractC1206jM5284a = AbstractC1206j.m5284a();
                    }
                    zza = abstractC1206jM5284a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return abstractC1206jM5284a;
    }
}
