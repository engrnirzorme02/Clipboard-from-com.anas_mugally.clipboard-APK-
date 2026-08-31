package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.common.zzab;
import com.google.android.gms.internal.common.zzac;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.common.util.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3763r {

    /* JADX INFO: renamed from: a */
    private static String f14908a;

    /* JADX INFO: renamed from: b */
    private static int f14909b;

    /* JADX INFO: renamed from: c */
    private static Boolean f14910c;

    /* JADX INFO: renamed from: a */
    public static String m18205a() throws Throwable {
        BufferedReader bufferedReader;
        if (f14908a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f14908a = Application.getProcessName();
            } else {
                int iMyPid = f14909b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f14909b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                AbstractC3718s.m18083l(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                AbstractC3756k.m18186a(bufferedReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    AbstractC3756k.m18186a(bufferedReader);
                }
                f14908a = strTrim;
            }
        }
        return f14908a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18206b() {
        Boolean boolValueOf = f14910c;
        if (boolValueOf == null) {
            if (AbstractC3760o.m18200h()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objZza = zzl.zza(Process.class, "isIsolated", new zzj[0]);
                    Object[] objArr = new Object[0];
                    if (objZza == null) {
                        throw new zzac(zzab.zza("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objZza;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f14910c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
