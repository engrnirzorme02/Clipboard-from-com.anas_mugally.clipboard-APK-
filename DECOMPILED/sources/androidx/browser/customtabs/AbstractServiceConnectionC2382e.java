package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import p205b.InterfaceC2918b;

/* JADX INFO: renamed from: androidx.browser.customtabs.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceConnectionC2382e implements ServiceConnection {
    private Context mApplicationContext;

    /* JADX INFO: renamed from: androidx.browser.customtabs.e$a */
    class a extends AbstractC2380c {
        a(InterfaceC2918b interfaceC2918b, ComponentName componentName, Context context) {
            super(interfaceC2918b, componentName, context);
        }
    }

    Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2380c abstractC2380c);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new a(InterfaceC2918b.a.m14646L0(iBinder), componentName, this.mApplicationContext));
    }

    void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
