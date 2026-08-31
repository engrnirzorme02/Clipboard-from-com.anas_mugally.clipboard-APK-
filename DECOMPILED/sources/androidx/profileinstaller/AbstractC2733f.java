package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.measurement.ExecutorC2688k;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.profileinstaller.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2733f {

    /* JADX INFO: renamed from: a */
    private static final c f10687a = new a();

    /* JADX INFO: renamed from: b */
    static final c f10688b = new b();

    /* JADX INFO: renamed from: androidx.profileinstaller.f$a */
    class a implements c {
        a() {
        }

        @Override // androidx.profileinstaller.AbstractC2733f.c
        /* JADX INFO: renamed from: a */
        public void mo12842a(int i7, Object obj) {
        }

        @Override // androidx.profileinstaller.AbstractC2733f.c
        /* JADX INFO: renamed from: b */
        public void mo12843b(int i7, Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.f$b */
    class b implements c {
        b() {
        }

        @Override // androidx.profileinstaller.AbstractC2733f.c
        /* JADX INFO: renamed from: a */
        public void mo12842a(int i7, Object obj) {
            String str;
            if (i7 == 1) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            } else if (i7 == 2) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
            } else if (i7 == 3) {
                str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
            } else if (i7 != 4) {
                str = i7 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
            } else {
                str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
            }
            Log.d("ProfileInstaller", str);
        }

        @Override // androidx.profileinstaller.AbstractC2733f.c
        /* JADX INFO: renamed from: b */
        public void mo12843b(int i7, Object obj) {
            String str;
            switch (i7) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i7 == 6 || i7 == 7 || i7 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.f$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo12842a(int i7, Object obj);

        /* JADX INFO: renamed from: b */
        void mo12843b(int i7, Object obj);
    }

    /* JADX INFO: renamed from: b */
    static boolean m12889b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* JADX INFO: renamed from: c */
    static void m12890c(Context context, Executor executor, c cVar) {
        m12889b(context.getFilesDir());
        m12893f(executor, cVar, 11, null);
    }

    /* JADX INFO: renamed from: d */
    static boolean m12891d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j7 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z7 = j7 == packageInfo.lastUpdateTime;
                if (z7) {
                    cVar.mo12843b(2, null);
                }
                return z7;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    static void m12892e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    static void m12893f(Executor executor, final c cVar, final int i7, final Object obj) {
        executor.execute(new Runnable() { // from class: w0.b
            @Override // java.lang.Runnable
            public final void run() {
                cVar.mo12843b(i7, obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    private static boolean m12894g(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        C2729b c2729b = new C2729b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c2729b.m12864e()) {
            return false;
        }
        boolean zM12867m = c2729b.m12865h().m12866l().m12867m();
        if (zM12867m) {
            m12892e(packageInfo, file);
        }
        return zM12867m;
    }

    /* JADX INFO: renamed from: h */
    public static void m12895h(Context context) {
        m12896i(context, new ExecutorC2688k(), f10687a);
    }

    /* JADX INFO: renamed from: i */
    public static void m12896i(Context context, Executor executor, c cVar) {
        m12897j(context, executor, cVar, false);
    }

    /* JADX INFO: renamed from: j */
    static void m12897j(Context context, Executor executor, c cVar, boolean z7) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z8 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z7 && m12891d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                AbstractC2735h.m12944c(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (m12894g(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z7) {
                z8 = true;
            }
            AbstractC2735h.m12944c(context, z8);
        } catch (PackageManager.NameNotFoundException e7) {
            cVar.mo12843b(7, e7);
            AbstractC2735h.m12944c(context, false);
        }
    }

    /* JADX INFO: renamed from: k */
    static void m12898k(Context context, Executor executor, c cVar) {
        try {
            m12892e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m12893f(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e7) {
            m12893f(executor, cVar, 7, e7);
        }
    }
}
