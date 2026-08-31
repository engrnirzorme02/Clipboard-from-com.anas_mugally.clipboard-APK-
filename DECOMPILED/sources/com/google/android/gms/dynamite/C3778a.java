package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.a */
/* JADX INFO: loaded from: classes.dex */
final class C3778a extends PathClassLoader {
    C3778a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z7) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z7);
    }
}
