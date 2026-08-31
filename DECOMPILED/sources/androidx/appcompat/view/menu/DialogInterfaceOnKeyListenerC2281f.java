package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC2241b;
import p255h.AbstractC5526g;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.f */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnKeyListenerC2281f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC2285j.a {

    /* JADX INFO: renamed from: a */
    private C2280e f7698a;

    /* JADX INFO: renamed from: b */
    private DialogInterfaceC2241b f7699b;

    /* JADX INFO: renamed from: c */
    C2278c f7700c;

    /* JADX INFO: renamed from: d */
    private InterfaceC2285j.a f7701d;

    public DialogInterfaceOnKeyListenerC2281f(C2280e c2280e) {
        this.f7698a = c2280e;
    }

    /* JADX INFO: renamed from: a */
    public void m9542a() {
        DialogInterfaceC2241b dialogInterfaceC2241b = this.f7699b;
        if (dialogInterfaceC2241b != null) {
            dialogInterfaceC2241b.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m9543b(IBinder iBinder) {
        C2280e c2280e = this.f7698a;
        DialogInterfaceC2241b.a aVar = new DialogInterfaceC2241b.a(c2280e.m9538w());
        C2278c c2278c = new C2278c(aVar.m9098b(), AbstractC5526g.f21088j);
        this.f7700c = c2278c;
        c2278c.mo9436h(this);
        this.f7698a.m9517b(this.f7700c);
        aVar.mo9099c(this.f7700c.m9471a(), this);
        View viewM9491A = c2280e.m9491A();
        if (viewM9491A != null) {
            aVar.mo9101e(viewM9491A);
        } else {
            aVar.mo9103g(c2280e.m9540y()).mo9116t(c2280e.m9541z());
        }
        aVar.mo9110n(this);
        DialogInterfaceC2241b dialogInterfaceC2241bMo9097a = aVar.mo9097a();
        this.f7699b = dialogInterfaceC2241bMo9097a;
        dialogInterfaceC2241bMo9097a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f7699b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f7699b.show();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j.a
    /* JADX INFO: renamed from: c */
    public void mo9249c(C2280e c2280e, boolean z7) {
        if (z7 || c2280e == this.f7698a) {
            m9542a();
        }
        InterfaceC2285j.a aVar = this.f7701d;
        if (aVar != null) {
            aVar.mo9249c(c2280e, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j.a
    /* JADX INFO: renamed from: d */
    public boolean mo9250d(C2280e c2280e) {
        InterfaceC2285j.a aVar = this.f7701d;
        if (aVar != null) {
            return aVar.mo9250d(c2280e);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i7) {
        this.f7698a.m9504O((C2282g) this.f7700c.m9471a().getItem(i7), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f7700c.mo9432c(this.f7698a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f7699b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f7699b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f7698a.m9522e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f7698a.performShortcut(i7, keyEvent, 0);
    }
}
