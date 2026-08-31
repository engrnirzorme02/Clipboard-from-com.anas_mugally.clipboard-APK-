package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p104N.AbstractC0905b;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* JADX INFO: renamed from: e */
    private static final String[] f9287e = {"_display_name", "_size"};

    /* JADX INFO: renamed from: f */
    private static final File f9288f = new File("/");

    /* JADX INFO: renamed from: r */
    private static final HashMap f9289r = new HashMap();

    /* JADX INFO: renamed from: a */
    private final Object f9290a;

    /* JADX INFO: renamed from: b */
    private final int f9291b;

    /* JADX INFO: renamed from: c */
    private String f9292c;

    /* JADX INFO: renamed from: d */
    private InterfaceC2433b f9293d;

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$a */
    static class C2432a {
        /* JADX INFO: renamed from: a */
        static File[] m10573a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$b */
    interface InterfaceC2433b {
        /* JADX INFO: renamed from: a */
        File mo10574a(Uri uri);

        /* JADX INFO: renamed from: b */
        Uri mo10575b(File file);
    }

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$c */
    static class C2434c implements InterfaceC2433b {

        /* JADX INFO: renamed from: a */
        private final String f9294a;

        /* JADX INFO: renamed from: b */
        private final HashMap f9295b = new HashMap();

        C2434c(String str) {
            this.f9294a = str;
        }

        /* JADX INFO: renamed from: d */
        private boolean m10576d(String str, String str2) {
            return FileProvider.m10572k(str).startsWith(FileProvider.m10572k(str2) + '/');
        }

        @Override // androidx.core.content.FileProvider.InterfaceC2433b
        /* JADX INFO: renamed from: a */
        public File mo10574a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Unable to find path from root: " + uri);
            }
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = (File) this.f9295b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (m10576d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC2433b
        /* JADX INFO: renamed from: b */
        public Uri mo10575b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f9295b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (m10576d(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme("content").authority(this.f9294a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* JADX INFO: renamed from: c */
        void m10577c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f9295b.put(str, file.getCanonicalFile());
            } catch (IOException e7) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e7);
            }
        }
    }

    public FileProvider() {
        this(0);
    }

    /* JADX INFO: renamed from: b */
    private static File m10563b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: c */
    private static Object[] m10564c(Object[] objArr, int i7) {
        Object[] objArr2 = new Object[i7];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        return objArr2;
    }

    /* JADX INFO: renamed from: d */
    private static String[] m10565d(String[] strArr, int i7) {
        String[] strArr2 = new String[i7];
        System.arraycopy(strArr, 0, strArr2, 0, i7);
        return strArr2;
    }

    /* JADX INFO: renamed from: e */
    static XmlResourceParser m10566e(Context context, String str, ProviderInfo providerInfo, int i7) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i7 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i7);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    /* JADX INFO: renamed from: f */
    private InterfaceC2433b m10567f() {
        InterfaceC2433b interfaceC2433b;
        synchronized (this.f9290a) {
            try {
                AbstractC0905b.m4128d(this.f9292c, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f9293d == null) {
                    this.f9293d = m10568g(getContext(), this.f9292c, this.f9291b);
                }
                interfaceC2433b = this.f9293d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2433b;
    }

    /* JADX INFO: renamed from: g */
    private static InterfaceC2433b m10568g(Context context, String str, int i7) {
        InterfaceC2433b interfaceC2433bM10571j;
        HashMap map = f9289r;
        synchronized (map) {
            try {
                interfaceC2433bM10571j = (InterfaceC2433b) map.get(str);
                if (interfaceC2433bM10571j == null) {
                    try {
                        try {
                            interfaceC2433bM10571j = m10571j(context, str, i7);
                            map.put(str, interfaceC2433bM10571j);
                        } catch (IOException e7) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                        }
                    } catch (XmlPullParserException e8) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2433bM10571j;
    }

    /* JADX INFO: renamed from: h */
    public static Uri m10569h(Context context, String str, File file) {
        return m10568g(context, str, 0).mo10575b(file);
    }

    /* JADX INFO: renamed from: i */
    private static int m10570i(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* JADX INFO: renamed from: j */
    private static InterfaceC2433b m10571j(Context context, String str, int i7) throws XmlPullParserException, IOException {
        C2434c c2434c = new C2434c(str);
        XmlResourceParser xmlResourceParserM10566e = m10566e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i7);
        while (true) {
            int next = xmlResourceParserM10566e.next();
            if (next == 1) {
                return c2434c;
            }
            if (next == 2) {
                String name = xmlResourceParserM10566e.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserM10566e.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserM10566e.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f9288f;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = AbstractC2436b.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = AbstractC2436b.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrM10573a = C2432a.m10573a(context);
                    if (fileArrM10573a.length > 0) {
                        externalStorageDirectory = fileArrM10573a[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    c2434c.m10577c(attributeValue, m10563b(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static String m10572k(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.f9290a) {
            this.f9292c = str2;
        }
        HashMap map = f9289r;
        synchronized (map) {
            map.remove(str2);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return m10567f().mo10574a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileMo10574a = m10567f().mo10574a(uri);
        int iLastIndexOf = fileMo10574a.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileMo10574a.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(m10567f().mo10574a(uri), m10570i(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i7;
        File fileMo10574a = m10567f().mo10574a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f9287e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i8 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i8] = "_display_name";
                i7 = i8 + 1;
                objArr[i8] = queryParameter == null ? fileMo10574a.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i8] = "_size";
                    i7 = i8 + 1;
                    objArr[i8] = Long.valueOf(fileMo10574a.length());
                }
            }
            i8 = i7;
        }
        String[] strArrM10565d = m10565d(strArr3, i8);
        Object[] objArrM10564c = m10564c(objArr, i8);
        MatrixCursor matrixCursor = new MatrixCursor(strArrM10565d, 1);
        matrixCursor.addRow(objArrM10564c);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected FileProvider(int i7) {
        this.f9290a = new Object();
        this.f9291b = i7;
    }
}
