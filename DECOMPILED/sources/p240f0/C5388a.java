package p240f0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.api.C3553a;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5388a {

    /* JADX INFO: renamed from: a */
    private final b f20526a;

    /* JADX INFO: renamed from: b */
    private int f20527b = C3553a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c */
    private int f20528c = 0;

    /* JADX INFO: renamed from: f0.a$a */
    private static class a extends b {

        /* JADX INFO: renamed from: a */
        private final EditText f20529a;

        /* JADX INFO: renamed from: b */
        private final C5394g f20530b;

        a(EditText editText, boolean z7) {
            this.f20529a = editText;
            C5394g c5394g = new C5394g(editText, z7);
            this.f20530b = c5394g;
            editText.addTextChangedListener(c5394g);
            editText.setEditableFactory(C5389b.getInstance());
        }

        @Override // p240f0.C5388a.b
        /* JADX INFO: renamed from: a */
        KeyListener mo24428a(KeyListener keyListener) {
            if (keyListener instanceof C5392e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C5392e(keyListener);
        }

        @Override // p240f0.C5388a.b
        /* JADX INFO: renamed from: b */
        InputConnection mo24429b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof C5390c ? inputConnection : new C5390c(this.f20529a, inputConnection, editorInfo);
        }

        @Override // p240f0.C5388a.b
        /* JADX INFO: renamed from: c */
        void mo24430c(boolean z7) {
            this.f20530b.m24460c(z7);
        }
    }

    /* JADX INFO: renamed from: f0.a$b */
    static class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        abstract KeyListener mo24428a(KeyListener keyListener);

        /* JADX INFO: renamed from: b */
        abstract InputConnection mo24429b(InputConnection inputConnection, EditorInfo editorInfo);

        /* JADX INFO: renamed from: c */
        abstract void mo24430c(boolean z7);
    }

    public C5388a(EditText editText, boolean z7) {
        AbstractC0910g.m4140h(editText, "editText cannot be null");
        this.f20526a = new a(editText, z7);
    }

    /* JADX INFO: renamed from: a */
    public KeyListener m24425a(KeyListener keyListener) {
        return this.f20526a.mo24428a(keyListener);
    }

    /* JADX INFO: renamed from: b */
    public InputConnection m24426b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f20526a.mo24429b(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: c */
    public void m24427c(boolean z7) {
        this.f20526a.mo24430c(z7);
    }
}
