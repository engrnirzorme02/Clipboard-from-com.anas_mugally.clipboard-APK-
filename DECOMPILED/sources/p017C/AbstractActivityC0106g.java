package p017C;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.C2400k;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.C2659u;
import androidx.lifecycle.FragmentC2617I;
import androidx.lifecycle.InterfaceC2657s;
import kotlin.jvm.internal.AbstractC6118n;
import p111O.AbstractC1076u;

/* JADX INFO: renamed from: C.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0106g extends Activity implements InterfaceC2657s, AbstractC1076u.a {

    /* JADX INFO: renamed from: a */
    private final C2400k f552a = new C2400k(0, 1, null);

    /* JADX INFO: renamed from: b */
    private final C2659u f553b = new C2659u(this);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m417R(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return true;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    @Override // p111O.AbstractC1076u.a
    /* JADX INFO: renamed from: E */
    public boolean mo418E(KeyEvent event) {
        AbstractC6118n.m27187e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.lifecycle.InterfaceC2657s
    /* JADX INFO: renamed from: P */
    public AbstractC2650l mo419P() {
        return this.f553b;
    }

    /* JADX INFO: renamed from: Q */
    protected final boolean m420Q(String[] strArr) {
        return !m417R(strArr);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC6118n.m27187e(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView, "getDecorView(...)");
        if (AbstractC1076u.m4776d(decorView, event)) {
            return true;
        }
        return AbstractC1076u.m4777e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        AbstractC6118n.m27187e(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView, "getDecorView(...)");
        if (AbstractC1076u.m4776d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC2617I.f10407b.m12549c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC6118n.m27187e(outState, "outState");
        this.f553b.m12652n(AbstractC2650l.b.CREATED);
        super.onSaveInstanceState(outState);
    }
}
