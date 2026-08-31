package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.widget.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C2342a0 extends ContextWrapper {

    /* JADX INFO: renamed from: c */
    private static final Object f8174c = new Object();

    /* JADX INFO: renamed from: d */
    private static ArrayList f8175d;

    /* JADX INFO: renamed from: a */
    private final Resources f8176a;

    /* JADX INFO: renamed from: b */
    private final Resources.Theme f8177b;

    private C2342a0(Context context) {
        super(context);
        if (!C2360j0.m10105c()) {
            this.f8176a = new C2346c0(this, context.getResources());
            this.f8177b = null;
            return;
        }
        C2360j0 c2360j0 = new C2360j0(this, context.getResources());
        this.f8176a = c2360j0;
        Resources.Theme themeNewTheme = c2360j0.newTheme();
        this.f8177b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* JADX INFO: renamed from: a */
    private static boolean m9996a(Context context) {
        return ((context instanceof C2342a0) || (context.getResources() instanceof C2346c0) || (context.getResources() instanceof C2360j0) || !C2360j0.m10105c()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static Context m9997b(Context context) {
        if (!m9996a(context)) {
            return context;
        }
        synchronized (f8174c) {
            try {
                ArrayList arrayList = f8175d;
                if (arrayList == null) {
                    f8175d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f8175d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f8175d.remove(size);
                        }
                    }
                    for (int size2 = f8175d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f8175d.get(size2);
                        C2342a0 c2342a0 = weakReference2 != null ? (C2342a0) weakReference2.get() : null;
                        if (c2342a0 != null && c2342a0.getBaseContext() == context) {
                            return c2342a0;
                        }
                    }
                }
                C2342a0 c2342a1 = new C2342a0(context);
                f8175d.add(new WeakReference(c2342a1));
                return c2342a1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f8176a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f8176a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f8177b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        Resources.Theme theme = this.f8177b;
        if (theme == null) {
            super.setTheme(i7);
        } else {
            theme.applyStyle(i7, true);
        }
    }
}
