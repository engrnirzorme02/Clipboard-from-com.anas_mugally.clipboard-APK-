package com.google.android.gms.common.internal;

import com.google.android.gms.common.util.AbstractC3756k;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.o */
/* JADX INFO: loaded from: classes.dex */
public class C3710o {

    /* JADX INFO: renamed from: b */
    private static final C3700j f14811b = new C3700j("LibraryVersion", "");

    /* JADX INFO: renamed from: c */
    private static final C3710o f14812c = new C3710o();

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap f14813a = new ConcurrentHashMap();

    protected C3710o() {
    }

    /* JADX INFO: renamed from: a */
    public static C3710o m18049a() {
        return f14812c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX INFO: renamed from: b */
    public String m18050b(String str) throws Throwable {
        ?? r7;
        InputStream resourceAsStream;
        AbstractC3718s.m18078g(str, "Please provide a valid libraryName");
        if (this.f14813a.containsKey(str)) {
            return (String) this.f14813a.get(str);
        }
        Properties properties = new Properties();
        ?? r8 = 0;
        r8 = 0;
        r8 = 0;
        InputStream inputStream = null;
        try {
            try {
                resourceAsStream = C3710o.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        String property = properties.getProperty("version", null);
                        f14811b.m18046d("LibraryVersion", str + " version is " + property);
                        r8 = property;
                    } else {
                        f14811b.m18047e("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                } catch (IOException e7) {
                    e = e7;
                    r7 = r8;
                    inputStream = resourceAsStream;
                    f14811b.m18045c("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    ?? r9 = r7;
                    resourceAsStream = inputStream;
                    r8 = r9;
                } catch (Throwable th) {
                    th = th;
                    r8 = resourceAsStream;
                    if (r8 != 0) {
                        AbstractC3756k.m18186a(r8);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e8) {
            e = e8;
            r7 = 0;
        }
        if (resourceAsStream != null) {
            AbstractC3756k.m18186a(resourceAsStream);
        }
        if (r8 == 0) {
            f14811b.m18044b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            r8 = "UNKNOWN";
        }
        this.f14813a.put(str, r8);
        return r8;
    }
}
