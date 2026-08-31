package p111O;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: O.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1035b {

    /* JADX INFO: renamed from: a */
    private final Context f3835a;

    /* JADX INFO: renamed from: b */
    private a f3836b;

    /* JADX INFO: renamed from: c */
    private b f3837c;

    /* JADX INFO: renamed from: O.b$a */
    public interface a {
    }

    /* JADX INFO: renamed from: O.b$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z7);
    }

    public AbstractC1035b(Context context) {
        this.f3835a = context;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo4610a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo4611b();

    /* JADX INFO: renamed from: c */
    public abstract View mo4612c(MenuItem menuItem);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo4613d();

    /* JADX INFO: renamed from: e */
    public abstract void mo4614e(SubMenu subMenu);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo4615f();

    /* JADX INFO: renamed from: g */
    public void m4616g() {
        this.f3837c = null;
        this.f3836b = null;
    }

    /* JADX INFO: renamed from: h */
    public void m4617h(a aVar) {
        this.f3836b = aVar;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo4618i(b bVar);
}
