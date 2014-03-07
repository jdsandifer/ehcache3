/*
 * Copyright Terracotta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ehcache.spi.cache;

import org.ehcache.Cache;
import org.ehcache.internal.ServiceLocator;
import org.ehcache.spi.service.Service;
import org.ehcache.spi.service.ServiceConfiguration;

/**
 * @author Chris Dennis
 * @author Alex Snaps
 */
public interface CacheProvider extends Service {

  <K, V> Cache<K, V> createCache(Class<K> keyClazz, Class<V> valueClazz, ServiceLocator serviceProvider, ServiceConfiguration<?>... config);

  void releaseCache(Cache<?, ?> resource);
}
