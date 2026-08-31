package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.appcompat.view.e */
/* JADX INFO: loaded from: classes.dex */
public class C2269e extends AbstractC2266b implements C2280e.a {

    /* JADX INFO: renamed from: c */
    private Context f7510c;

    /* JADX INFO: renamed from: d */
    private ActionBarContextView f7511d;

    /* JADX INFO: renamed from: e */
    private AbstractC2266b.a f7512e;

    /* JADX INFO: renamed from: f */
    private WeakReference f7513f;

    /* JADX INFO: renamed from: r */
    private boolean f7514r;

    /* JADX INFO: renamed from: s */
    private boolean f7515s;

    /* JADX INFO: renamed from: t */
    private C2280e f7516t;

    public C2269e(Context context, ActionBarContextView actionBarContextView, AbstractC2266b.a aVar, boolean z7) {
        this.f7510c = context;
        this.f7511d = actionBarContextView;
        this.f7512e = aVar;
        C2280e c2280eM9512X = new C2280e(actionBarContextView.getContext()).m9512X(1);
        this.f7516t = c2280eM9512X;
        c2280eM9512X.mo9511W(this);
        this.f7515s = z7;
    }

    @Override // androidx.appcompat.view.menu.C2280e.a
    /* JADX INFO: renamed from: a */
    public boolean mo9231a(C2280e c2280e, MenuItem menuItem) {
        return this.f7512e.mo9254d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C2280e.a
    /* JADX INFO: renamed from: b */
    public void mo9233b(C2280e c2280e) {
        mo9358k();
        this.f7511d.m9636l();
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: c */
    public void mo9352c() {
        if (this.f7514r) {
            return;
        }
        this.f7514r = true;
        this.f7512e.mo9251a(this);
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: d */
    public View mo9353d() {
        WeakReference weakReference = this.f7513f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: e */
    public Menu mo9354e() {
        return this.f7516t;
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: f */
    public MenuInflater mo9355f() {
        return new C2271g(this.f7511d.getContext());
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: g */
    public CharSequence mo9356g() {
        return this.f7511d.getSubtitle();
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: i */
    public CharSequence mo9357i() {
        return this.f7511d.getTitle();
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: k */
    public void mo9358k() {
        this.f7512e.mo9253c(this, this.f7516t);
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: l */
    public boolean mo9359l() {
        return this.f7511d.m9634j();
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: m */
    public void mo9360m(View view) {
        this.f7511d.setCustomView(view);
        this.f7513f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: n */
    public void mo9361n(int i7) {
        mo9362o(this.f7510c.getString(i7));
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: o */
    public void mo9362o(CharSequence charSequence) {
        this.f7511d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: q */
    public void mo9363q(int i7) {
        mo9364r(this.f7510c.getString(i7));
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: r */
    public void mo9364r(CharSequence charSequence) {
        this.f7511d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC2266b
    /* JADX INFO: renamed from: s */
    public void mo9365s(boolean z7) {
        super.mo9365s(z7);
        this.f7511d.setTitleOptional(z7);
    }
}
