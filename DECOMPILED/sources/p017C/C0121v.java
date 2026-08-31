package p017C;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.AbstractC2436b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: C.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0121v implements Iterable {

    /* JADX INFO: renamed from: a */
    private final ArrayList f662a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final Context f663b;

    /* JADX INFO: renamed from: C.v$a */
    public interface a {
        /* JADX INFO: renamed from: u */
        Intent mo575u();
    }

    private C0121v(Context context) {
        this.f663b = context;
    }

    /* JADX INFO: renamed from: g */
    public static C0121v m569g(Context context) {
        return new C0121v(context);
    }

    /* JADX INFO: renamed from: a */
    public C0121v m570a(Intent intent) {
        this.f662a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public C0121v m571b(Activity activity) {
        Intent intentMo575u = activity instanceof a ? ((a) activity).mo575u() : null;
        if (intentMo575u == null) {
            intentMo575u = AbstractC0109j.m425a(activity);
        }
        if (intentMo575u != null) {
            ComponentName component = intentMo575u.getComponent();
            if (component == null) {
                component = intentMo575u.resolveActivity(this.f663b.getPackageManager());
            }
            m572e(component);
            m570a(intentMo575u);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0121v m572e(ComponentName componentName) {
        int size = this.f662a.size();
        try {
            Intent intentM426b = AbstractC0109j.m426b(this.f663b, componentName);
            while (intentM426b != null) {
                this.f662a.add(size, intentM426b);
                intentM426b = AbstractC0109j.m426b(this.f663b, intentM426b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e7);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f662a.iterator();
    }

    /* JADX INFO: renamed from: j */
    public void m573j() {
        m574k(null);
    }

    /* JADX INFO: renamed from: k */
    public void m574k(Bundle bundle) {
        if (this.f662a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f662a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (AbstractC2436b.startActivities(this.f663b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f663b.startActivity(intent);
    }
}
