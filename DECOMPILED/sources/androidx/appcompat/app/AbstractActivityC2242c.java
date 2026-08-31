package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.AbstractC2266b;
import androidx.appcompat.widget.C2360j0;
import androidx.fragment.app.AbstractActivityC2592j;
import p010B0.C0047f;
import p017C.AbstractC0101b;
import p017C.AbstractC0109j;
import p017C.C0121v;
import p081K.C0718j;
import p231e.InterfaceC5249b;

/* JADX INFO: renamed from: androidx.appcompat.app.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2242c extends AbstractActivityC2592j implements InterfaceC2243d, C0121v.a {

    /* JADX INFO: renamed from: M */
    private AbstractC2245f f7317M;

    /* JADX INFO: renamed from: N */
    private Resources f7318N;

    /* JADX INFO: renamed from: androidx.appcompat.app.c$a */
    class a implements C0047f.b {
        a() {
        }

        @Override // p010B0.C0047f.b
        /* JADX INFO: renamed from: a */
        public Bundle mo174a() {
            Bundle bundle = new Bundle();
            AbstractActivityC2242c.this.m9121O0().mo9148A(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.c$b */
    class b implements InterfaceC5249b {
        b() {
        }

        @Override // p231e.InterfaceC5249b
        /* JADX INFO: renamed from: a */
        public void mo9134a(Context context) {
            AbstractC2245f abstractC2245fM9121O0 = AbstractActivityC2242c.this.m9121O0();
            abstractC2245fM9121O0.mo9166s();
            abstractC2245fM9121O0.mo9169w(AbstractActivityC2242c.this.mo198A().m185a("androidx:appcompat"));
        }
    }

    public AbstractActivityC2242c() {
        m9119Q0();
    }

    /* JADX INFO: renamed from: Q0 */
    private void m9119Q0() {
        mo198A().m187c("androidx:appcompat", new a());
        m23990l0(new b());
    }

    /* JADX INFO: renamed from: X0 */
    private boolean m9120X0(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: O0 */
    public AbstractC2245f m9121O0() {
        if (this.f7317M == null) {
            this.f7317M = AbstractC2245f.m9141h(this, this);
        }
        return this.f7317M;
    }

    /* JADX INFO: renamed from: P0 */
    public AbstractC2240a m9122P0() {
        return m9121O0().mo9165r();
    }

    /* JADX INFO: renamed from: R0 */
    public void m9123R0(C0121v c0121v) {
        c0121v.m571b(this);
    }

    /* JADX INFO: renamed from: S0 */
    protected void m9124S0(C0718j c0718j) {
    }

    /* JADX INFO: renamed from: T0 */
    protected void m9125T0(int i7) {
    }

    /* JADX INFO: renamed from: U0 */
    public void m9126U0(C0121v c0121v) {
    }

    /* JADX INFO: renamed from: V0 */
    public void m9127V0() {
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m9128W0() {
        Intent intentMo575u = mo575u();
        if (intentMo575u == null) {
            return false;
        }
        if (!m9130Z0(intentMo575u)) {
            m9129Y0(intentMo575u);
            return true;
        }
        C0121v c0121vM569g = C0121v.m569g(this);
        m9123R0(c0121vM569g);
        m9126U0(c0121vM569g);
        c0121vM569g.m573j();
        try {
            AbstractC0101b.m386b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m9129Y0(Intent intent) {
        AbstractC0109j.m429e(this, intent);
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m9130Z0(Intent intent) {
        return AbstractC0109j.m430f(this, intent);
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m23993t0();
        m9121O0().mo9158e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(m9121O0().mo9160g(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC2240a abstractC2240aM9122P0 = m9122P0();
        if (getWindow().hasFeature(0)) {
            if (abstractC2240aM9122P0 == null || !abstractC2240aM9122P0.m9080f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p017C.AbstractActivityC0106g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC2240a abstractC2240aM9122P0 = m9122P0();
        if (keyCode == 82 && abstractC2240aM9122P0 != null && abstractC2240aM9122P0.m9089o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i7) {
        return m9121O0().mo9161j(i7);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m9121O0().mo9164p();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f7318N == null && C2360j0.m10105c()) {
            this.f7318N = new C2360j0(this, super.getResources());
        }
        Resources resources = this.f7318N;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.InterfaceC2243d
    /* JADX INFO: renamed from: i */
    public void mo9131i(AbstractC2266b abstractC2266b) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m9121O0().mo9167t();
    }

    @Override // androidx.appcompat.app.InterfaceC2243d
    /* JADX INFO: renamed from: k */
    public void mo9132k(AbstractC2266b abstractC2266b) {
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m9121O0().mo9168v(configuration);
        if (this.f7318N != null) {
            this.f7318N.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m9127V0();
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m9121O0().mo9170x();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (m9120X0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        AbstractC2240a abstractC2240aM9122P0 = m9122P0();
        if (menuItem.getItemId() != 16908332 || abstractC2240aM9122P0 == null || (abstractC2240aM9122P0.mo9083i() & 4) == 0) {
            return false;
        }
        return m9128W0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i7, Menu menu) {
        return super.onMenuOpened(i7, menu);
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m9121O0().mo9171y(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        m9121O0().mo9172z();
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onStart() {
        super.onStart();
        m9121O0().mo9149B();
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onStop() {
        super.onStop();
        m9121O0().mo9150C();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        m9121O0().mo9157L(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC2240a abstractC2240aM9122P0 = m9122P0();
        if (getWindow().hasFeature(0)) {
            if (abstractC2240aM9122P0 == null || !abstractC2240aM9122P0.m9090p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity
    public void setContentView(int i7) {
        m23993t0();
        m9121O0().mo9152G(i7);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        super.setTheme(i7);
        m9121O0().mo9156K(i7);
    }

    @Override // p017C.C0121v.a
    /* JADX INFO: renamed from: u */
    public Intent mo575u() {
        return AbstractC0109j.m425a(this);
    }

    @Override // androidx.appcompat.app.InterfaceC2243d
    /* JADX INFO: renamed from: z */
    public AbstractC2266b mo9133z(AbstractC2266b.a aVar) {
        return null;
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity
    public void setContentView(View view) {
        m23993t0();
        m9121O0().mo9153H(view);
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m23993t0();
        m9121O0().mo9154I(view, layoutParams);
    }
}
