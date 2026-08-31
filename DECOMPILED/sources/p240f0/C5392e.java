package p240f0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C2558f;

/* JADX INFO: renamed from: f0.e */
/* JADX INFO: loaded from: classes.dex */
final class C5392e implements KeyListener {

    /* JADX INFO: renamed from: a */
    private final KeyListener f20540a;

    /* JADX INFO: renamed from: b */
    private final a f20541b;

    /* JADX INFO: renamed from: f0.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public boolean m24437a(Editable editable, int i7, KeyEvent keyEvent) {
            return C2558f.m11753g(editable, i7, keyEvent);
        }
    }

    C5392e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f20540a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f20540a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f20541b.m24437a(editable, i7, keyEvent) || this.f20540a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f20540a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f20540a.onKeyUp(view, editable, i7, keyEvent);
    }

    C5392e(KeyListener keyListener, a aVar) {
        this.f20540a = keyListener;
        this.f20541b = aVar;
    }
}
