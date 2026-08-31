package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.AbstractC2266b;
import p111O.AbstractC1076u;
import p223d.DialogC5193w;
import p255h.AbstractC5520a;

/* JADX INFO: renamed from: androidx.appcompat.app.p */
/* JADX INFO: loaded from: classes.dex */
public class DialogC2255p extends DialogC5193w implements InterfaceC2243d {

    /* JADX INFO: renamed from: d */
    private AbstractC2245f f7437d;

    /* JADX INFO: renamed from: e */
    private final AbstractC1076u.a f7438e;

    public DialogC2255p(Context context, int i7) {
        super(context, m9284g(context, i7));
        this.f7438e = new AbstractC1076u.a() { // from class: androidx.appcompat.app.o
            @Override // p111O.AbstractC1076u.a
            /* JADX INFO: renamed from: E */
            public final boolean mo418E(KeyEvent keyEvent) {
                return this.f7436a.m9286h(keyEvent);
            }
        };
        AbstractC2245f abstractC2245fM9285f = m9285f();
        abstractC2245fM9285f.mo9156K(m9284g(context, i7));
        abstractC2245fM9285f.mo9169w(null);
    }

    /* JADX INFO: renamed from: g */
    private static int m9284g(Context context, int i7) {
        if (i7 != 0) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5520a.f20987y, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p223d.DialogC5193w, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m24013d();
        m9285f().mo9158e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m9285f().mo9170x();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1076u.m4777e(this.f7438e, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public AbstractC2245f m9285f() {
        if (this.f7437d == null) {
            this.f7437d = AbstractC2245f.m9142i(this, this);
        }
        return this.f7437d;
    }

    @Override // android.app.Dialog
    public View findViewById(int i7) {
        return m9285f().mo9161j(i7);
    }

    /* JADX INFO: renamed from: h */
    boolean m9286h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.InterfaceC2243d
    /* JADX INFO: renamed from: i */
    public void mo9131i(AbstractC2266b abstractC2266b) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m9285f().mo9167t();
    }

    /* JADX INFO: renamed from: j */
    public boolean m9287j(int i7) {
        return m9285f().mo9151F(i7);
    }

    @Override // androidx.appcompat.app.InterfaceC2243d
    /* JADX INFO: renamed from: k */
    public void mo9132k(AbstractC2266b abstractC2266b) {
    }

    @Override // p223d.DialogC5193w, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        m9285f().mo9166s();
        super.onCreate(bundle);
        m9285f().mo9169w(bundle);
    }

    @Override // p223d.DialogC5193w, android.app.Dialog
    protected void onStop() {
        super.onStop();
        m9285f().mo9150C();
    }

    @Override // p223d.DialogC5193w, android.app.Dialog
    public void setContentView(int i7) {
        m24013d();
        m9285f().mo9152G(i7);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m9285f().mo9157L(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC2243d
    /* JADX INFO: renamed from: z */
    public AbstractC2266b mo9133z(AbstractC2266b.a aVar) {
        return null;
    }

    @Override // p223d.DialogC5193w, android.app.Dialog
    public void setContentView(View view) {
        m24013d();
        m9285f().mo9153H(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i7) {
        super.setTitle(i7);
        m9285f().mo9157L(getContext().getString(i7));
    }

    @Override // p223d.DialogC5193w, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m24013d();
        m9285f().mo9154I(view, layoutParams);
    }
}
