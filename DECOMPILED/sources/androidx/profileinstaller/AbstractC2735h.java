package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.C2406d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.profileinstaller.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2735h {

    /* JADX INFO: renamed from: a */
    private static final C2406d f10691a = C2406d.m10350B();

    /* JADX INFO: renamed from: b */
    private static final Object f10692b = new Object();

    /* JADX INFO: renamed from: c */
    private static c f10693c = null;

    /* JADX INFO: renamed from: androidx.profileinstaller.h$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static PackageInfo m12945a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.h$b */
    static class b {

        /* JADX INFO: renamed from: a */
        final int f10694a;

        /* JADX INFO: renamed from: b */
        final int f10695b;

        /* JADX INFO: renamed from: c */
        final long f10696c;

        /* JADX INFO: renamed from: d */
        final long f10697d;

        b(int i7, int i8, long j7, long j8) {
            this.f10694a = i7;
            this.f10695b = i8;
            this.f10696c = j7;
            this.f10697d = j8;
        }

        /* JADX INFO: renamed from: a */
        static b m12946a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        void m12947b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f10694a);
                dataOutputStream.writeInt(this.f10695b);
                dataOutputStream.writeLong(this.f10696c);
                dataOutputStream.writeLong(this.f10697d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f10695b == bVar.f10695b && this.f10696c == bVar.f10696c && this.f10694a == bVar.f10694a && this.f10697d == bVar.f10697d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f10695b), Long.valueOf(this.f10696c), Integer.valueOf(this.f10694a), Long.valueOf(this.f10697d));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.h$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        final int f10698a;

        /* JADX INFO: renamed from: b */
        private final boolean f10699b;

        /* JADX INFO: renamed from: c */
        private final boolean f10700c;

        /* JADX INFO: renamed from: d */
        private final boolean f10701d;

        c(int i7, boolean z7, boolean z8, boolean z9) {
            this.f10698a = i7;
            this.f10700c = z8;
            this.f10699b = z7;
            this.f10701d = z9;
        }
    }

    /* JADX INFO: renamed from: a */
    private static long m12942a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m12945a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    private static c m12943b(int i7, boolean z7, boolean z8, boolean z9) {
        c cVar = new c(i7, z7, z8, z9);
        f10693c = cVar;
        f10691a.mo10330x(cVar);
        return f10693c;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX INFO: renamed from: c */
    static c m12944c(Context context, boolean z7) {
        int i7;
        boolean z8;
        int i8;
        File file;
        boolean z9;
        File file2;
        long length;
        boolean z10;
        File file3;
        b bVarM12946a;
        b bVar;
        int i9;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z7 && (cVar = f10693c) != null) {
            return cVar;
        }
        synchronized (f10692b) {
            if (z7) {
                i7 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                assetFileDescriptorOpenFd.close();
                i8 = Build.VERSION.SDK_INT;
                if (i8 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    long jM12942a = m12942a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        bVarM12946a = b.m12946a(file3);
                    } else {
                        bVarM12946a = null;
                    }
                    if (bVarM12946a == null) {
                        if (!z8) {
                            i7 = 327680;
                        } else if (z9) {
                            i7 = 1;
                        } else if (z10) {
                            i7 = 2;
                        }
                    } else if (!z8) {
                        i7 = 327680;
                    } else if (z9) {
                        i7 = 1;
                    } else if (z10) {
                        i7 = 2;
                    }
                    if (z7) {
                        i7 = 2;
                    }
                    if (bVarM12946a != null) {
                        i7 = 3;
                    }
                    int i10 = i7;
                    bVar = new b(1, i10, jM12942a, length);
                    if (bVarM12946a != null) {
                        bVar.m12947b(file3);
                    } else {
                        bVar.m12947b(file3);
                    }
                    return m12943b(i10, z9, z10, z8);
                }
                return m12943b(262144, false, false, z8);
            }
            c cVar2 = f10693c;
            if (cVar2 != null) {
                return cVar2;
            }
            i7 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                z8 = false;
            }
            i8 = Build.VERSION.SDK_INT;
            if (i8 >= 28 && i8 != 30) {
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                try {
                    long jM12942a2 = m12942a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarM12946a = b.m12946a(file3);
                        } catch (IOException unused2) {
                            return m12943b(131072, z9, z10, z8);
                        }
                    } else {
                        bVarM12946a = null;
                    }
                    if (bVarM12946a == null && bVarM12946a.f10696c == jM12942a2 && (i9 = bVarM12946a.f10695b) != 2) {
                        i7 = i9;
                    } else if (!z8) {
                        i7 = 327680;
                    } else if (z9) {
                        i7 = 1;
                    } else if (z10) {
                        i7 = 2;
                    }
                    if (z7 && z10 && i7 != 1) {
                        i7 = 2;
                    }
                    if (bVarM12946a != null && bVarM12946a.f10695b == 2 && i7 == 1 && length3 < bVarM12946a.f10697d) {
                        i7 = 3;
                    }
                    int i11 = i7;
                    bVar = new b(1, i11, jM12942a2, length);
                    if (bVarM12946a != null || !bVarM12946a.equals(bVar)) {
                        try {
                            bVar.m12947b(file3);
                        } catch (IOException unused3) {
                            i11 = 196608;
                        }
                    }
                    return m12943b(i11, z9, z10, z8);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return m12943b(65536, z9, z10, z8);
                }
            }
            return m12943b(262144, false, false, z8);
            throw th;
        }
    }
}
