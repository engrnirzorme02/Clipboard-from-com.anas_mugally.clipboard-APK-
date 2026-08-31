package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p255h.AbstractC5528i;

/* JADX INFO: renamed from: androidx.appcompat.view.d */
/* JADX INFO: loaded from: classes.dex */
public class C2268d extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    private static Configuration f7504f;

    /* JADX INFO: renamed from: a */
    private int f7505a;

    /* JADX INFO: renamed from: b */
    private Resources.Theme f7506b;

    /* JADX INFO: renamed from: c */
    private LayoutInflater f7507c;

    /* JADX INFO: renamed from: d */
    private Configuration f7508d;

    /* JADX INFO: renamed from: e */
    private Resources f7509e;

    public C2268d(Context context, int i7) {
        super(context);
        this.f7505a = i7;
    }

    /* JADX INFO: renamed from: b */
    private Resources m9378b() {
        if (this.f7509e == null) {
            Configuration configuration = this.f7508d;
            if (configuration == null || m9380e(configuration)) {
                this.f7509e = super.getResources();
            } else {
                this.f7509e = createConfigurationContext(this.f7508d).getResources();
            }
        }
        return this.f7509e;
    }

    /* JADX INFO: renamed from: d */
    private void m9379d() {
        boolean z7 = this.f7506b == null;
        if (z7) {
            this.f7506b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f7506b.setTo(theme);
            }
        }
        m9383f(this.f7506b, this.f7505a, z7);
    }

    /* JADX INFO: renamed from: e */
    private static boolean m9380e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f7504f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f7504f = configuration2;
        }
        return configuration.equals(f7504f);
    }

    /* JADX INFO: renamed from: a */
    public void m9381a(Configuration configuration) {
        if (this.f7509e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f7508d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f7508d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: c */
    public int m9382c() {
        return this.f7505a;
    }

    /* JADX INFO: renamed from: f */
    protected void m9383f(Resources.Theme theme, int i7, boolean z7) {
        theme.applyStyle(i7, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m9378b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f7507c == null) {
            this.f7507c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f7507c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f7506b;
        if (theme != null) {
            return theme;
        }
        if (this.f7505a == 0) {
            this.f7505a = AbstractC5528i.f21112d;
        }
        m9379d();
        return this.f7506b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        if (this.f7505a != i7) {
            this.f7505a = i7;
            m9379d();
        }
    }

    public C2268d(Context context, Resources.Theme theme) {
        super(context);
        this.f7506b = theme;
    }
}
