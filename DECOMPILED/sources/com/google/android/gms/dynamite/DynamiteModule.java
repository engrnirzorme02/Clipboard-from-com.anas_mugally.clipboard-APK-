package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3752g;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p170W2.C1841f;
import p235e3.AbstractC5339a;
import p235e3.AbstractC5340b;
import p235e3.AbstractC5342d;
import p235e3.AbstractC5343e;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h */
    private static Boolean f14929h = null;

    /* JADX INFO: renamed from: i */
    private static String f14930i = null;

    /* JADX INFO: renamed from: j */
    private static boolean f14931j = false;

    /* JADX INFO: renamed from: k */
    private static int f14932k = -1;

    /* JADX INFO: renamed from: l */
    private static Boolean f14933l;

    /* JADX INFO: renamed from: q */
    private static C3790m f14938q;

    /* JADX INFO: renamed from: r */
    private static C3791n f14939r;

    /* JADX INFO: renamed from: a */
    private final Context f14940a;

    /* JADX INFO: renamed from: m */
    private static final ThreadLocal f14934m = new ThreadLocal();

    /* JADX INFO: renamed from: n */
    private static final ThreadLocal f14935n = new C3779b();

    /* JADX INFO: renamed from: o */
    private static final InterfaceC3777b.a f14936o = new C3780c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC3777b f14923b = new C3781d();

    /* JADX INFO: renamed from: c */
    public static final InterfaceC3777b f14924c = new C3782e();

    /* JADX INFO: renamed from: d */
    public static final InterfaceC3777b f14925d = new C3783f();

    /* JADX INFO: renamed from: e */
    public static final InterfaceC3777b f14926e = new C3784g();

    /* JADX INFO: renamed from: f */
    public static final InterfaceC3777b f14927f = new C3785h();

    /* JADX INFO: renamed from: g */
    public static final InterfaceC3777b f14928g = new C3786i();

    /* JADX INFO: renamed from: p */
    public static final InterfaceC3777b f14937p = new C3787j();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C3776a extends Exception {
        /* synthetic */ C3776a(String str, AbstractC5343e abstractC5343e) {
            super(str);
        }

        /* synthetic */ C3776a(String str, Throwable th, AbstractC5343e abstractC5343e) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface InterfaceC3777b {

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            int mo18235a(Context context, String str, boolean z7);

            int zza(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public int f14941a = 0;

            /* JADX INFO: renamed from: b */
            public int f14942b = 0;

            /* JADX INFO: renamed from: c */
            public int f14943c = 0;
        }

        /* JADX INFO: renamed from: a */
        b mo18234a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        AbstractC3718s.m18083l(context);
        this.f14940a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m18222a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC3714q.m18053b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m18223c(Context context, String str) {
        return m18225f(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0244  */
    /* JADX WARN: Code duplicated, block: B:118:0x024a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0253  */
    /* JADX WARN: Code duplicated, block: B:126:0x0265 A[Catch: all -> 0x007d, TryCatch #7 {all -> 0x007d, blocks: (B:7:0x0040, B:11:0x0077, B:18:0x0083, B:21:0x0089, B:24:0x0091, B:103:0x01f7, B:104:0x0202, B:107:0x0205, B:108:0x0206, B:109:0x020e, B:126:0x0265, B:127:0x027c, B:110:0x020f, B:112:0x022d, B:114:0x023c, B:124:0x025c, B:125:0x0264, B:128:0x027d, B:129:0x02ad), top: B:149:0x0040, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0089 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #7 {all -> 0x007d, blocks: (B:7:0x0040, B:11:0x0077, B:18:0x0083, B:21:0x0089, B:24:0x0091, B:103:0x01f7, B:104:0x0202, B:107:0x0205, B:108:0x0206, B:109:0x020e, B:126:0x0265, B:127:0x027c, B:110:0x020f, B:112:0x022d, B:114:0x023c, B:124:0x025c, B:125:0x0264, B:128:0x027d, B:129:0x02ad), top: B:149:0x0040, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[Catch: all -> 0x01ea, TryCatch #5 {, blocks: (B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4), top: B:146:0x0096, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TRY_ENTER, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TRY_ENTER, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0148 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0154 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0178 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017f A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0187 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0196 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a1 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c6 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1 A[Catch: all -> 0x0106, a -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, a -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6, B:36:0x00c9, B:37:0x00cb, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4, B:46:0x00e8, B:50:0x00ef), top: B:152:0x0095, inners: #0, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ec A[Catch: all -> 0x01ea, TRY_ENTER, TryCatch #5 {, blocks: (B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4), top: B:146:0x0096, outer: #8 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x0265, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0154, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public static DynamiteModule m18224e(Context context, InterfaceC3777b interfaceC3777b, String str) throws Throwable {
        long j7;
        DynamiteModule dynamiteModuleM18227h;
        int i7;
        Boolean bool;
        C3790m c3790mM18231l;
        int iZze;
        InterfaceC3772a interfaceC3772aM18238N0;
        Object objM18220M0;
        DynamiteModule dynamiteModule;
        C3788k c3788k;
        C3791n c3791n;
        C3788k c3788k2;
        boolean z7;
        InterfaceC3772a interfaceC3772aM18242L0;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        AbstractC5343e abstractC5343e = null;
        if (applicationContext == null) {
            throw new C3776a("null application Context", null);
        }
        ThreadLocal threadLocal = f14934m;
        C3788k c3788k3 = (C3788k) threadLocal.get();
        C3788k c3788k4 = new C3788k(null);
        threadLocal.set(c3788k4);
        ThreadLocal threadLocal2 = f14935n;
        Long l7 = (Long) threadLocal2.get();
        long jLongValue = l7.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            InterfaceC3777b.b bVarMo18234a = interfaceC3777b.mo18234a(context, str, f14936o);
            int i8 = bVarMo18234a.f14941a;
            j7 = 0;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + i8 + " and remote module " + str + ":" + bVarMo18234a.f14942b);
                int i9 = bVarMo18234a.f14943c;
                if (i9 != 0) {
                    if (i9 != -1) {
                        if (i9 == 1 || bVarMo18234a.f14942b != 0) {
                            if (i9 == -1) {
                                dynamiteModuleM18227h = m18227h(applicationContext, str);
                            } else {
                                if (i9 == 1) {
                                    throw new C3776a("VersionPolicy returned invalid code:" + i9, null);
                                }
                                try {
                                    i7 = bVarMo18234a.f14942b;
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (m18230k(context)) {
                                                throw new C3776a("Remote loading disabled", null);
                                            }
                                            bool = f14929h;
                                        }
                                        if (bool != null) {
                                            throw new C3776a("Failed to determine which loading route to use.", null);
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i7);
                                            synchronized (DynamiteModule.class) {
                                                c3791n = f14939r;
                                            }
                                            if (c3791n != null) {
                                                throw new C3776a("DynamiteLoaderV2 was not cached.", null);
                                            }
                                            c3788k2 = (C3788k) threadLocal.get();
                                            if (c3788k2 != null || c3788k2.f14944a == null) {
                                                throw new C3776a("No result cursor", null);
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = c3788k2.f14944a;
                                            BinderC3773b.m18221N0(null);
                                            synchronized (DynamiteModule.class) {
                                                z7 = f14932k >= 2;
                                            }
                                            if (z7) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                interfaceC3772aM18242L0 = c3791n.m18243M0(BinderC3773b.m18221N0(applicationContext2), str, i7, BinderC3773b.m18221N0(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                interfaceC3772aM18242L0 = c3791n.m18242L0(BinderC3773b.m18221N0(applicationContext2), str, i7, BinderC3773b.m18221N0(cursor2));
                                            }
                                            Context context2 = (Context) BinderC3773b.m18220M0(interfaceC3772aM18242L0);
                                            if (context2 == null) {
                                                throw new C3776a("Failed to get module context", abstractC5343e);
                                            }
                                            dynamiteModule = new DynamiteModule(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i7);
                                            c3790mM18231l = m18231l(context);
                                            if (c3790mM18231l != null) {
                                                throw new C3776a("Failed to create IDynamiteLoader.", null);
                                            }
                                            iZze = c3790mM18231l.zze();
                                            if (iZze >= 3) {
                                                c3788k = (C3788k) threadLocal.get();
                                                if (c3788k != null) {
                                                    throw new C3776a("No cached result cursor holder", null);
                                                }
                                                interfaceC3772aM18238N0 = c3790mM18231l.m18239O0(BinderC3773b.m18221N0(context), str, i7, BinderC3773b.m18221N0(c3788k.f14944a));
                                            } else if (iZze == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                interfaceC3772aM18238N0 = c3790mM18231l.m18240P0(BinderC3773b.m18221N0(context), str, i7);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                interfaceC3772aM18238N0 = c3790mM18231l.m18238N0(BinderC3773b.m18221N0(context), str, i7);
                                            }
                                            objM18220M0 = BinderC3773b.m18220M0(interfaceC3772aM18238N0);
                                            if (objM18220M0 != null) {
                                                throw new C3776a("Failed to load remote module.", null);
                                            }
                                            dynamiteModule = new DynamiteModule((Context) objM18220M0);
                                        }
                                        dynamiteModuleM18227h = dynamiteModule;
                                    } catch (RemoteException e7) {
                                        throw new C3776a("Failed to load remote module.", e7, null);
                                    } catch (C3776a e8) {
                                        throw e8;
                                    } catch (Throwable th) {
                                        AbstractC3752g.m18170a(context, th);
                                        throw new C3776a("Failed to load remote module.", th, null);
                                    }
                                } catch (C3776a e9) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e9.getMessage());
                                    int i10 = bVarMo18234a.f14941a;
                                    if (i10 == 0 || interfaceC3777b.mo18234a(context, str, new C3789l(i10, 0)).f14943c != -1) {
                                        throw new C3776a("Remote load failed. No local fallback found.", e9, null);
                                    }
                                    dynamiteModuleM18227h = m18227h(applicationContext, str);
                                }
                            }
                            if (jLongValue == 0) {
                                f14935n.remove();
                            } else {
                                f14935n.set(l7);
                            }
                            cursor = c3788k4.f14944a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            f14934m.set(c3788k3);
                            return dynamiteModuleM18227h;
                        }
                    } else if (bVarMo18234a.f14941a != 0) {
                        i9 = -1;
                        if (i9 == 1) {
                        }
                        if (i9 == -1) {
                            dynamiteModuleM18227h = m18227h(applicationContext, str);
                        } else {
                            if (i9 == 1) {
                                throw new C3776a("VersionPolicy returned invalid code:" + i9, null);
                            }
                            i7 = bVarMo18234a.f14942b;
                            synchronized (DynamiteModule.class) {
                                if (m18230k(context)) {
                                    throw new C3776a("Remote loading disabled", null);
                                }
                                bool = f14929h;
                                if (bool != null) {
                                    throw new C3776a("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i7);
                                    synchronized (DynamiteModule.class) {
                                        c3791n = f14939r;
                                        if (c3791n != null) {
                                            throw new C3776a("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        c3788k2 = (C3788k) threadLocal.get();
                                        if (c3788k2 != null) {
                                        }
                                        throw new C3776a("No result cursor", null);
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i7);
                                c3790mM18231l = m18231l(context);
                                if (c3790mM18231l != null) {
                                    throw new C3776a("Failed to create IDynamiteLoader.", null);
                                }
                                iZze = c3790mM18231l.zze();
                                if (iZze >= 3) {
                                    c3788k = (C3788k) threadLocal.get();
                                    if (c3788k != null) {
                                        throw new C3776a("No cached result cursor holder", null);
                                    }
                                    interfaceC3772aM18238N0 = c3790mM18231l.m18239O0(BinderC3773b.m18221N0(context), str, i7, BinderC3773b.m18221N0(c3788k.f14944a));
                                } else if (iZze == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    interfaceC3772aM18238N0 = c3790mM18231l.m18240P0(BinderC3773b.m18221N0(context), str, i7);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    interfaceC3772aM18238N0 = c3790mM18231l.m18238N0(BinderC3773b.m18221N0(context), str, i7);
                                }
                                objM18220M0 = BinderC3773b.m18220M0(interfaceC3772aM18238N0);
                                if (objM18220M0 != null) {
                                    throw new C3776a("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objM18220M0);
                                dynamiteModuleM18227h = dynamiteModule;
                            }
                        }
                        if (jLongValue == 0) {
                            f14935n.remove();
                        } else {
                            f14935n.set(l7);
                        }
                        cursor = c3788k4.f14944a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f14934m.set(c3788k3);
                        return dynamiteModuleM18227h;
                    }
                }
                throw new C3776a("No acceptable module " + str + " found. Local version is " + bVarMo18234a.f14941a + " and remote version is " + bVarMo18234a.f14942b + ".", null);
            } catch (Throwable th2) {
                th = th2;
                if (jLongValue == j7) {
                    f14935n.remove();
                } else {
                    f14935n.set(l7);
                }
                Cursor cursor3 = c3788k4.f14944a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f14934m.set(c3788k3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j7 = 0;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:140:0x01cc */
    /* JADX WARN: Code duplicated, block: B:106:0x017d A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00ec, blocks: (B:3:0x0002, B:64:0x00e1, B:66:0x00e7, B:74:0x010d, B:102:0x016f, B:106:0x017d, B:124:0x01d2, B:125:0x01d5, B:119:0x01c9, B:72:0x00f2, B:127:0x01d7, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00de, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00e0, B:61:0x00c2), top: B:134:0x0002, inners: #5, #12 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0 A[Catch: all -> 0x0036, TryCatch #11 {all -> 0x0036, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b9, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0098, B:44:0x00a0, B:39:0x0073, B:41:0x0079, B:42:0x008a, B:47:0x00a3, B:50:0x00a6, B:51:0x00b0, B:17:0x003e), top: B:143:0x0026, inners: #2 }] */
    /* JADX INFO: renamed from: f */
    public static int m18225f(Context context, String str, boolean z7) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f14929h;
                Cursor cursor2 = null;
                int iM18236L0 = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        m18228i(classLoader);
                                    } catch (C3776a unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m18230k(context)) {
                                        return 0;
                                    }
                                    if (f14931j) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM18226g = m18226g(context, str, z7, true);
                                                String str2 = f14930i;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM24334a = AbstractC5342d.m24334a();
                                                    if (classLoaderM24334a == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            AbstractC5340b.m24333a();
                                                            String str3 = f14930i;
                                                            AbstractC3718s.m18083l(str3);
                                                            classLoaderM24334a = AbstractC5339a.m24332a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f14930i;
                                                            AbstractC3718s.m18083l(str4);
                                                            classLoaderM24334a = new C3778a(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    m18228i(classLoaderM24334a);
                                                    declaredField.set(null, classLoaderM24334a);
                                                    f14929h = bool2;
                                                    return iM18226g;
                                                }
                                                return iM18226g;
                                            } catch (C3776a unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f14929h = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e7) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e7.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m18226g(context, str, z7, false);
                    } catch (C3776a e8) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e8.getMessage());
                        return 0;
                    }
                }
                C3790m c3790mM18231l = m18231l(context);
                try {
                    if (c3790mM18231l != null) {
                        try {
                            int iZze = c3790mM18231l.zze();
                            if (iZze >= 3) {
                                C3788k c3788k = (C3788k) f14934m.get();
                                if (c3788k == null || (cursor = c3788k.f14944a) == null) {
                                    Cursor cursor3 = (Cursor) BinderC3773b.m18220M0(c3790mM18231l.m18241Q0(BinderC3773b.m18221N0(context), str, z7, ((Long) f14935n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i7 = cursor3.getInt(0);
                                                cursor2 = (i7 <= 0 || !m18229j(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iM18236L0 = i7;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e9) {
                                            remoteException = e9;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iM18236L0 = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iM18236L0 = c3790mM18231l.m18237M0(BinderC3773b.m18221N0(context), str, z7);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iM18236L0 = c3790mM18231l.m18236L0(BinderC3773b.m18221N0(context), str, z7);
                            }
                        } catch (RemoteException e10) {
                            remoteException = e10;
                        }
                    }
                    return iM18236L0;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            AbstractC3752g.m18170a(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0144: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:93:0x0144 */
    /* JADX INFO: renamed from: g */
    private static int m18226g(Context context, String str, boolean z7, boolean z8) throws Throwable {
        Throwable th;
        Exception exc;
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z9 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z7 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f14935n.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z10 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i7 = 0; i7 < count; i7++) {
                                    if (!cursorQuery.moveToPosition(i7)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr4 = new Object[columnCount];
                                    for (int i8 = 0; i8 < columnCount; i8++) {
                                        int type = cursorQuery.getType(i8);
                                        if (type == 0) {
                                            objArr4[i8] = null;
                                        } else if (type == 1) {
                                            objArr4[i8] = Long.valueOf(cursorQuery.getLong(i8));
                                        } else if (type == 2) {
                                            objArr4[i8] = Double.valueOf(cursorQuery.getDouble(i8));
                                        } else if (type == 3) {
                                            objArr4[i8] = cursorQuery.getString(i8);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr4[i8] = cursorQuery.getBlob(i8);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i9 = matrixCursor.getInt(0);
                            if (i9 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f14930i = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f14932k = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (matrixCursor.getInt(columnIndex2) == 0) {
                                                z9 = false;
                                            }
                                            f14931j = z9;
                                            z10 = z9;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                if (m18229j(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z8 && z10) {
                                throw new C3776a("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i9;
                        }
                    } catch (Exception e7) {
                        exc = e7;
                        if (exc instanceof C3776a) {
                            throw exc;
                        }
                        throw new C3776a("V2 version check failed: " + exc.getMessage(), exc, objArr == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C3776a("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th6) {
                th = th6;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (Exception e8) {
            exc = e8;
        } catch (Throwable th7) {
            th = th7;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    private static DynamiteModule m18227h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    /* JADX INFO: renamed from: i */
    private static void m18228i(ClassLoader classLoader) throws C3776a {
        C3791n c3791n;
        AbstractC5343e abstractC5343e = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c3791n = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c3791n = iInterfaceQueryLocalInterface instanceof C3791n ? (C3791n) iInterfaceQueryLocalInterface : new C3791n(iBinder);
            }
            f14939r = c3791n;
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new C3776a("Failed to instantiate dynamite loader", e, abstractC5343e);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new C3776a("Failed to instantiate dynamite loader", e, abstractC5343e);
        } catch (InstantiationException e9) {
            e = e9;
            throw new C3776a("Failed to instantiate dynamite loader", e, abstractC5343e);
        } catch (NoSuchMethodException e10) {
            e = e10;
            throw new C3776a("Failed to instantiate dynamite loader", e, abstractC5343e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new C3776a("Failed to instantiate dynamite loader", e, abstractC5343e);
        }
    }

    /* JADX INFO: renamed from: j */
    private static boolean m18229j(Cursor cursor) {
        C3788k c3788k = (C3788k) f14934m.get();
        if (c3788k == null || c3788k.f14944a != null) {
            return false;
        }
        c3788k.f14944a = cursor;
        return true;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m18230k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f14933l)) {
            return true;
        }
        boolean z7 = false;
        if (f14933l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != AbstractC3760o.m18201i() ? 0 : 268435456);
            if (C1841f.m7623f().mo7609h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z7 = true;
            }
            f14933l = Boolean.valueOf(z7);
            if (z7 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f14931j = true;
            }
        }
        if (!z7) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z7;
    }

    /* JADX INFO: renamed from: l */
    private static C3790m m18231l(Context context) {
        C3790m c3790m;
        synchronized (DynamiteModule.class) {
            C3790m c3790m2 = f14938q;
            if (c3790m2 != null) {
                return c3790m2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c3790m = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c3790m = iInterfaceQueryLocalInterface instanceof C3790m ? (C3790m) iInterfaceQueryLocalInterface : new C3790m(iBinder);
                }
                if (c3790m != null) {
                    f14938q = c3790m;
                    return c3790m;
                }
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e7.getMessage());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public Context m18232b() {
        return this.f14940a;
    }

    /* JADX INFO: renamed from: d */
    public IBinder m18233d(String str) throws C3776a {
        try {
            return (IBinder) this.f14940a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new C3776a("Failed to instantiate module class: ".concat(String.valueOf(str)), e7, null);
        }
    }
}
