package p252g4;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import p228d4.C5235g;

/* JADX INFO: renamed from: g4.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5499i {

    /* JADX INFO: renamed from: a */
    private static final char[] f20848a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 g4.i$a, still in use, count: 1, list:
      (r0v0 g4.i$a) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 g4.i$a) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: g4.i$a */
    static final class a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* JADX INFO: renamed from: v */
        private static final Map f20859v;

        static {
            HashMap map = new HashMap(4);
            f20859v = map;
            map.put("armeabi-v7a", new a());
            map.put("armeabi", new a());
            map.put("arm64-v8a", new a());
            map.put("x86", new a());
        }

        private a() {
            super(str, i);
        }

        /* JADX INFO: renamed from: d */
        static a m24810d() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C5235g.m24179f().m24186i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = (a) f20859v.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f20860w.clone();
        }
    }

    /* JADX INFO: renamed from: A */
    public static String m24781A(String str) {
        return m24801s(str, "SHA-1");
    }

    /* JADX INFO: renamed from: B */
    public static String m24782B(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m24783a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized long m24784b(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX INFO: renamed from: c */
    public static long m24785c(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m24786d(Context context) {
        if (!m24787e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m24787e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX INFO: renamed from: f */
    public static void m24788f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e7) {
                C5235g.m24179f().m24183e(str, e7);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m24789g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m24790h(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null) {
                    arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            String string = sb.toString();
            if (string.length() > 0) {
                return m24781A(string);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m24791i(Context context, String str, boolean z7) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iM24798p = m24798p(context, str, "bool");
            if (iM24798p > 0) {
                return resources.getBoolean(iM24798p);
            }
            int iM24798p2 = m24798p(context, str, "string");
            if (iM24798p2 > 0) {
                return Boolean.parseBoolean(context.getString(iM24798p2));
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: j */
    public static List m24792j(Context context) {
        ArrayList arrayList = new ArrayList();
        int iM24798p = m24798p(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iM24798p2 = m24798p(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iM24798p3 = m24798p(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iM24798p == 0 || iM24798p2 == 0 || iM24798p3 == 0) {
            C5235g.m24179f().m24180b(String.format("Could not find resources: %d %d %d", Integer.valueOf(iM24798p), Integer.valueOf(iM24798p2), Integer.valueOf(iM24798p3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(iM24798p);
        String[] stringArray2 = context.getResources().getStringArray(iM24798p2);
        String[] stringArray3 = context.getResources().getStringArray(iM24798p3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            C5235g.m24179f().m24180b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i7 = 0; i7 < stringArray3.length; i7++) {
            arrayList.add(new C5496f(stringArray[i7], stringArray2[i7], stringArray3[i7]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static int m24793k() {
        return a.m24810d().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: l */
    public static int m24794l() {
        boolean zM24806x = m24806x();
        ?? r7 = zM24806x;
        if (m24807y()) {
            r7 = (zM24806x ? 1 : 0) | 2;
        }
        return m24805w() ? r7 | 4 : r7;
    }

    /* JADX INFO: renamed from: m */
    public static String m24795m(Context context) {
        int iM24798p = m24798p(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iM24798p == 0) {
            iM24798p = m24798p(context, "com.crashlytics.android.build_id", "string");
        }
        if (iM24798p != 0) {
            return context.getResources().getString(iM24798p);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m24796n(Context context) {
        return (m24806x() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public static String m24797o(Context context) {
        int i7 = context.getApplicationContext().getApplicationInfo().icon;
        if (i7 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i7);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m24798p(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m24797o(context));
    }

    /* JADX INFO: renamed from: q */
    public static SharedPreferences m24799q(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* JADX INFO: renamed from: r */
    public static String m24800r(Context context) {
        int iM24798p = m24798p(context, "com.google.firebase.crashlytics.version_control_info", "string");
        if (iM24798p == 0) {
            return null;
        }
        return context.getResources().getString(iM24798p);
    }

    /* JADX INFO: renamed from: s */
    private static String m24801s(String str, String str2) {
        return m24802t(str.getBytes(), str2);
    }

    /* JADX INFO: renamed from: t */
    private static String m24802t(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return m24803u(messageDigest.digest());
        } catch (NoSuchAlgorithmException e7) {
            C5235g.m24179f().m24183e("Could not create hashing algorithm: " + str + ", returning empty string.", e7);
            return "";
        }
    }

    /* JADX INFO: renamed from: u */
    public static String m24803u(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            int i8 = i7 * 2;
            char[] cArr2 = f20848a;
            cArr[i8] = cArr2[(b7 & 255) >>> 4];
            cArr[i8 + 1] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m24804v(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m24805w() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m24806x() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    /* JADX INFO: renamed from: y */
    public static boolean m24807y() {
        boolean zM24806x = m24806x();
        String str = Build.TAGS;
        if ((zM24806x || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zM24806x && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m24808z(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
